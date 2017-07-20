package com.erp.biz.util;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.axis.utils.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Helper
{
    private final static Logger logger = LogManager.getLogger(Helper.class);

    public static <T> void setFieldValue(T obj, String fieldName, String fieldValue) throws Exception
    {
        Class<?> clazz = obj.getClass();
        Field f = Helper.getTheField(clazz, fieldName);
        if (f == null)
        {
            return;
        }

        if (fieldValue == null)
        {
            return;
        }

        f.setAccessible(true);
        Class<?> fieldTypeClazz = f.getType();
        String fieldTypeName = fieldTypeClazz.getSimpleName();
        if ("Date".equalsIgnoreCase(fieldTypeName))
        {
            Date date = convertToDate(fieldValue);
            f.set(obj, date);
        }
        else if ("String".equalsIgnoreCase(fieldTypeName))
        {
            f.set(obj, fieldValue);
        }
        else if ("boolean".equals(fieldTypeName))
        {
            if ("true".equals(fieldValue) || "1".equals(fieldValue))
            {
                f.setBoolean(obj, true);
            }
            else
            {
                f.setBoolean(obj, false);
            }
        }
        else if ("Boolean".equals(fieldTypeName))
        {
            if ("null".equals(fieldValue))
            {
                f.set(obj, null);
            }
            else if ("true".equals(fieldValue) || "1".equals(fieldValue))
            {
                f.set(obj, Boolean.TRUE);
            }
            else
            {
                f.set(obj, Boolean.FALSE);
            }
        }
        else if ("int".equalsIgnoreCase(fieldTypeName))
        {
            f.setInt(obj, Integer.parseInt(fieldValue));
        }
        else if ("Integer".equalsIgnoreCase(fieldTypeName))
        {
            if (fieldValue == "")
            {
                f.set(obj, null);
            }
            else
            {
                f.set(obj, new Integer(fieldValue));
            }
        }
        else if ("long".equals(fieldTypeName))
        {
            f.setLong(obj, Long.parseLong(fieldValue));
        }
        else if ("Long".equals(fieldTypeName))
        {
            if (fieldValue == "")
            {
                f.set(obj, null);
            }
            else
            {
                f.set(obj, new Long(fieldValue));
            }
        }
        else if ("short".equals(fieldTypeName))
        {
            f.setShort(obj, Short.parseShort(fieldValue));
        }
        else if ("Short".equals(fieldTypeName))
        {
            f.set(obj, new Short(fieldValue));
        }
        else if ("byte".equals(fieldTypeName))
        {
            f.setShort(obj, Byte.parseByte(fieldValue));
        }
        else if ("Byte".equals(fieldTypeName))
        {
            f.set(obj, new Byte(fieldValue));
        }
        else if ("float".equals(fieldTypeName))
        {
            f.setFloat(obj, Float.parseFloat(fieldValue));
        }
        else if ("Float".equals(fieldTypeName))
        {
            f.set(obj, new Float(fieldValue));
        }
        else if ("double".equals(fieldTypeName))
        {
            f.setDouble(obj, Double.parseDouble(fieldValue));
        }
        else if ("Double".equals(fieldTypeName))
        {
            f.set(obj, new Double(fieldValue));
        }
        else if ("char".equalsIgnoreCase(fieldTypeName))
        {
            f.setChar(obj, Character.valueOf(fieldValue.charAt(0)));
        }
        else if ("Character".equalsIgnoreCase(fieldTypeName))
        {
            f.set(obj, new Character(fieldValue.charAt(0)));
        }
        else if ("BigDecimal".equalsIgnoreCase(fieldTypeName))
        {
            f.set(obj, new BigDecimal(fieldValue));
        }
    }

    private static Field getTheField(Class<?> clazz, String fieldName)
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
            logger.error("getTheField error :" + e.getMessage(), e);
            f = null;
        }
        return f;
    }

    public static <T> String getFieldValue(T obj, String fieldName)
    {
        Class<?> clazz = obj.getClass();
        Field f = Helper.getTheField(clazz, fieldName);
        if (f == null)
        {
            return null;
        }
        Object fieldValue = null;
        try
        {
            f.setAccessible(true);
            fieldValue = f.get(obj);

        }
        catch (IllegalArgumentException e)
        {
            logger.error("getFieldValue IllegalArgumentException :" + e.getMessage(), e);
            return null;
        }
        catch (IllegalAccessException e)
        {
            logger.error("getFieldValue IllegalAccessException" + e.getMessage(), e);
            return null;
        }

        if (fieldValue == null)
            return null;

        return fieldValue.toString();
    }

    public static <T> Object getFieldObjectValue(T obj, String fieldName)
    {
        Class<?> clazz = obj.getClass();
        Field f = Helper.getTheField(clazz, fieldName);
        if (f == null)
        {
            return null;
        }
        Object fieldValue = null;
        try
        {
            f.setAccessible(true);
            fieldValue = f.get(obj);

        }
        catch (IllegalArgumentException e)
        {
            logger.error("getFieldObjectValue IllegalArgumentException" + e.getMessage(), e);
            return null;
        }
        catch (IllegalAccessException e)
        {
            logger.error("getFieldObjectValue IllegalAccessException" + e.getMessage(), e);
            return null;
        }

        if (fieldValue == null)
        {
            return null;
        }

        // formatter number
        if (f.getType().getSimpleName().equalsIgnoreCase("double")
                || f.getType().getSimpleName().equalsIgnoreCase("BigDecimal"))
        {
            BigDecimal bigDecimal = new BigDecimal(fieldValue.toString());
            bigDecimal = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);
            fieldValue = bigDecimal.toString();
        }

        // formatter date
        if (f.getType().getSimpleName().equalsIgnoreCase("Date"))
        {
            fieldValue = convertToString((Date) fieldValue);
        }

        return fieldValue;
    }

    public static Date convertToDate(String date)
    {
        return convertUTCToDate(date);
    }

    public final static String yyyy_MM_ddTHHmmss = "yyyy-MM-dd'T'HH:mm:ss";
    public final static String yyyy_MM_ddHHmmss = "yyyy-MM-dd HH:mm:ss";
    public final static String yyyy_MM_dd = "yyyy-MM-dd";

    public static Date convertUTCToDate(String date)
    {
        Date res = null;
        try
        {
            String pattern = null;
            if (date != null)
            {
                date = date.replace("/", "-");
            }
            if (date.indexOf("T") != -1)
            {
                pattern = yyyy_MM_ddTHHmmss;
            }
            else if (date.indexOf(":") != -1)
            {
                pattern = yyyy_MM_ddHHmmss;
            }
            else
            {
                pattern = yyyy_MM_dd;
            }
            SimpleDateFormat dateTimeFormat = new SimpleDateFormat(pattern);
            dateTimeFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            res = (date == null || date.length() == 0) ? null : dateTimeFormat.parse(date);
        }
        catch (Exception e)
        {
            return null;
        }
        return res;
    }

    public static String convertUTCToString(Date date)
    {
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        dateTimeFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String reportDate = dateTimeFormat.format(date);
        return reportDate;
    }

    public static String convertToString(Date date)
    {
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateTimeFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String reportDate = dateTimeFormat.format(date);
        return reportDate;
    }

    public static XMLGregorianCalendar convertToXMLGregorianCalendar(Date date)
    {
        if (date == null)
        {
            return null;
        }
        XMLGregorianCalendar gc = null;
        try
        {
            GregorianCalendar cal = new GregorianCalendar();
            cal.setTime(date);
            cal.setTimeZone(TimeZone.getTimeZone("UTC"));
            gc = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        }
        catch (Exception e)
        {
            logger.error(e);
        }
        return gc;
    }

    public static XMLGregorianCalendar convertToXMLGregorianCalendarByString(String date)
    {
        return convertToXMLGregorianCalendar(convertUTCToDate(date));
    }

    public static Date convertToDate(XMLGregorianCalendar date)
    {
        Date d = null;
        if (date != null)
        {
            try
            {
                GregorianCalendar ca = date.toGregorianCalendar();
                ca.setTimeZone(TimeZone.getTimeZone("UTC"));
                d = ca.getTime();
            }
            catch (Exception e)
            {
                logger.error(e);
            }
        }
        return d;
    }

    public static BigDecimal String2BigDecimal(String amount)
    {
        if (StringUtils.isEmpty(amount))
        {
            return null;
        }
        BigDecimal b = new BigDecimal(amount).setScale(2, BigDecimal.ROUND_HALF_UP);
        return b;
    }

    public static BigInteger String2BigInteger(String value)
    {
        if (StringUtils.isEmpty(value))
        {
            return null;
        }
        if (value.indexOf(".")!=-1)
        {
            value = value.substring(0, value.indexOf("."));
        }
        BigInteger i = new BigInteger(value);
        return i;
    }

    public static BigDecimal bigDecimal2Negative(BigDecimal b)
    {
        if (b == null)
        {
            return null;
        }
        b = b.multiply(new BigDecimal(-1));
        return b;
    }

    /**
     * + URL中+号表示空格 %2B 空格 URL中的空格可以用+号或者编码 %20 / 分隔目录和子目录 %2F ? 分隔实际的URL和参数 %3F % 指定特殊字符 %25 # 表示书签 %23 &
     * URL中指定的参数间的分隔符 %26 = URL中指定参数的值 %3D
     * 
     * @param value
     * @return
     */
    public static String urlEscapeProcessing(String value)
    {
        if (value == null)
        {
            return null;
        }
        value = value.replace(" ", "%20").replace("/", "%2F").replace("#", "%23");

        return value;
    }
}
