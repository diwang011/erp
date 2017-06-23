package com.erp.biz.util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

import org.apache.axis.utils.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.erp.biz.model.ExcelData;
import com.erp.biz.model.RowData;

/**
 * 操作Excel表格的功能类
 */
public class ReadExcelUtil
{
    private Workbook wb;
    private Sheet st;
    private Row row;

    /**
     * 读取Excel数据内容
     * 
     * @param path
     * @return
     */
    public List<List<Object>> readExcelContent(String path, String fileName)
    {
        List<ExcelData> list = new ArrayList<ExcelData>();
        try
        {
            InputStream file = new FileInputStream(path);
            wb = WorkbookFactory.create(file);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        // 工作表个数
        int NumberOfSheets = wb.getNumberOfSheets();
        for (int y = 4; y < NumberOfSheets; y++)
        {
            st = wb.getSheetAt(y);
            String sheetName = st.getSheetName();
            if (sheetName == null || sheetName.indexOf("~") != -1 || sheetName.indexOf("Hidden") != -1)
            {
                continue;
            }
            int lastRowNum = st.getLastRowNum();
            // System.out.println(lastRowNum);
            // System.out.println(y + ">>>" + sheetName + "-------------\n");

            List<RowData> rowDatas = new ArrayList<RowData>();
            int rowNum = 0;
            Map<String, String> mapTitle3 = new TreeMap<String, String>();
            Map<String, String> mapTitle5 = new TreeMap<String, String>();
            for (int i = 3; i <= lastRowNum; i++)
            {
                List<Map<String, String>> callDatas = new ArrayList<Map<String, String>>();
                // 获取标题
                row = st.getRow(i);
                Iterator<Cell> callIterator = row.iterator();
                String cellTemp = null;
                Map<String, String> callData = new HashMap<String, String>();
                while (callIterator.hasNext())
                {
                    Cell call = callIterator.next();
                    String cellAddressString = call.getAddress().formatAsString();
                    String callValue = getCellFormatValue(call);
                    if (i == 3)
                    {
                        mapTitle3.put(cellAddressString, callValue);
                    }
                    else if (i == 4)
                    {
                    }
                    else if (i == 5)
                    {
                        mapTitle5.put(cellAddressString, callValue);
                    }
                    else
                    {
                        String cellTitle5 = mapTitle5.get(cellAddressString.replaceAll("\\d+", "") + "6");
                        String cellTitle3 = mapTitle3.get(cellAddressString.replaceAll("\\d+", "") + "4");
                        if (!StringUtils.isEmpty(cellTitle3))
                        {
                            cellTitle3 = cellTitle3.substring(cellTitle3.indexOf("(") + 1, cellTitle3.indexOf(")"));
                            cellTemp = cellTitle3;
                        }
                        if (!StringUtils.isEmpty(callValue))
                        {
                            if ("measure".equals(cellTitle5) || "unit".equals(cellTitle5))
                            {
                                cellTitle5 = cellTemp + "_" + cellTitle5;
                            }
                            if (callData.get(cellTitle5) != null)
                            {
                                callValue = callData.get(cellTitle5) + "&&&" + callValue;
                            }
                            callData.put(cellTitle5, callValue);
                            callDatas.add(callData);
                        }
                    }
                }
                if (callDatas.size() > 0)
                {
                    RowData rowData = new RowData();
                    rowData.setRowNum(rowNum);
                    rowData.setCallDatas(callDatas);
                    rowDatas.add(rowData);
                    rowNum++;
                }
            }
            if (rowDatas.size() > 0)
            {
                ExcelData content = new ExcelData();
                content.setSheetName(sheetName);
                content.setRowDatas(rowDatas);
                list.add(content);
            }
        }

        return getModelList(list, fileName);
    }

    private List<List<Object>> getModelList(List<ExcelData> excelDatas, String fileName)
    {
        List<List<Object>> lists = new ArrayList<List<Object>>();
        for (ExcelData excelData : excelDatas)
        {
            String sheetName = excelData.getSheetName();
            sheetName = sheetName.trim().replace(" ", "").replace("&", "And");
            List<RowData> rowDatas = excelData.getRowDatas();
            List<Object> list = new ArrayList<Object>();
            for (RowData content : rowDatas)
            {
                // System.out.println(sheetName);
                List<Map<String, String>> listContent = content.getCallDatas();
                Object baseModel = null;
                try
                {
                    Class clazz = Class.forName("com.erp.biz.model." + sheetName + "Table");
                    baseModel = clazz.newInstance();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                if (baseModel != null)
                {
                    for (Map<String, String> map : listContent)
                    {
                        for (Entry<String, String> entry : map.entrySet())
                        {
                            String name = entry.getKey();
                            String value = entry.getValue();
                            try
                            {
                                Field field = getTheField(baseModel.getClass(), name);
                                field.setAccessible(true);
                                if (field.getType().getName().indexOf("List") != -1)
                                {
                                    List<String> valueList = Arrays.asList(value.split("&&&"));
                                    field.set(baseModel, valueList);
                                }
                                else
                                {

                                    field.set(baseModel, value);
                                }
                            }
                            catch (Exception e)
                            {
                                e.printStackTrace();
                            }
                            // System.out.println(name + " >> " + value + " ");

                        }
                    }
                }

                list.add(baseModel);
            }
            if (list.size() > 0)
            {
                lists.add(list);
            }
        }
        return lists;
    }

    private Field getTheField(Class<?> clazz, String fieldName)
    {
        Field f = null;
        if (fieldName == null || fieldName.length() == 0)
        {
            return null;
        }
        if (clazz.getSimpleName().equalsIgnoreCase("Object"))
            return f;
        try
        {
            f = clazz.getDeclaredField(fieldName);
            if (f != null)
            {
                return f;
            }
        }
        catch (NoSuchFieldException e)
        {
            return getTheField(clazz.getSuperclass(), fieldName);
        }
        catch (Exception e)
        {
            f = null;
        }
        return f;
    }

    /**
     * 获取单元格数据内容为字符串类型的数据
     * 
     * @param cell
     *            Excel单元格
     * @return String 单元格数据内容
     */
    @SuppressWarnings("unused")
    private String getStringCellValue(Cell cell)
    {
        String strCell = "";
        switch (cell.getCellType())
        {
        case HSSFCell.CELL_TYPE_STRING:
            strCell = cell.getStringCellValue();
            break;
        case HSSFCell.CELL_TYPE_NUMERIC:
            strCell = String.valueOf(cell.getNumericCellValue());
            break;
        case HSSFCell.CELL_TYPE_BOOLEAN:
            strCell = String.valueOf(cell.getBooleanCellValue());
            break;
        case HSSFCell.CELL_TYPE_BLANK:
            strCell = "";
            break;
        default:
            strCell = "";
            break;
        }
        if (strCell.equals("") || strCell == null)
        {
            return "";
        }
        if (cell == null)
        {
            return "";
        }
        return strCell;
    }

    /**
     * 获取单元格数据内容为日期类型的数据
     * 
     * @param cell
     *            Excel单元格
     * @return String 单元格数据内容
     */
    @SuppressWarnings({ "deprecation", "unused" })
    private String getDateCellValue(Cell cell)
    {
        String result = "";
        try
        {
            int cellType = cell.getCellType();
            if (cellType == HSSFCell.CELL_TYPE_NUMERIC)
            {
                Date date = cell.getDateCellValue();
                result = (date.getYear() + 1900) + "-" + (date.getMonth() + 1) + "-" + date.getDate();
            }
            else if (cellType == HSSFCell.CELL_TYPE_STRING)
            {
                String date = getStringCellValue(cell);
                result = date.replaceAll("[年月]", "-").replace("日", "").trim();
            }
            else if (cellType == HSSFCell.CELL_TYPE_BLANK)
            {
                result = "";
            }
        }
        catch (Exception e)
        {
            System.out.println("日期格式不正确!");
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 根据Cell类型设置数据
     * 
     * @param cell
     * @return
     */
    private String getCellFormatValue(Cell cell)
    {
        String cellvalue = null;
        if (cell != null)
        {
            // 判断当前Cell的Type
            switch (cell.getCellType())
            {
            // 如果当前Cell的Type为NUMERIC
            case Cell.CELL_TYPE_NUMERIC:
            case Cell.CELL_TYPE_FORMULA:
            {
                // 判断当前的cell是否为Date
                if (DateUtil.isCellDateFormatted(cell))
                {
                    // 如果是Date类型则，转化为Data格式

                    // 方法1：这样子的data格式是带时分秒的：2011-10-12 0:00:00
                    // cellvalue = cell.getDateCellValue().toLocaleString();

                    // 方法2：这样子的data格式是不带带时分秒的：2011-10-12
                    Date date = cell.getDateCellValue();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    cellvalue = sdf.format(date);

                }
                // 如果是纯数字
                else
                {
                    // 取得当前Cell的数值
                    cellvalue = String.valueOf(cell.getNumericCellValue());
                }
                break;
            }
            // 如果当前Cell的Type为STRIN
            case Cell.CELL_TYPE_STRING:
                // 取得当前的Cell字符串
                cellvalue = cell.getRichStringCellValue().getString();
                break;
            }
        }
        return cellvalue;

    }

    /**
     * 使用 Map按key进行排序
     * 
     * @param map
     * @return
     */
    public static Map<String, String> sortMapByKey(Map<String, String> map)
    {
        if (map == null || map.isEmpty())
        {
            return null;
        }

        Map<String, String> sortMap = new TreeMap<String, String>(new MapKeyComparator());

        sortMap.putAll(map);

        return sortMap;
    }

}

class MapKeyComparator implements Comparator<String>
{

    @Override
    public int compare(String str1, String str2)
    {

        return str1.compareTo(str2);
    }
}