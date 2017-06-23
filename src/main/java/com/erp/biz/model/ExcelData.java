package com.erp.biz.model;

import java.util.List;

public class ExcelData
{
    private String sheetName;
    private List<RowData> rowDatas;

    public String getSheetName()
    {
        return sheetName;
    }

    public void setSheetName(String sheetName)
    {
        this.sheetName = sheetName;
    }

    public List<RowData> getRowDatas()
    {
        return rowDatas;
    }

    public void setRowDatas(List<RowData> rowDatas)
    {
        this.rowDatas = rowDatas;
    }
}
