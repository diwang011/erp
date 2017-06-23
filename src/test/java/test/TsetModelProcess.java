package test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.erp.biz.api.model.mp.Office;
import com.erp.biz.model.OfficeTable;
import com.erp.biz.util.Helper;

public class TsetModelProcess
{
    public static void main(String[] args)
    {
        // read2();
        read1();
        // read3();
    }

    private static void read3()
    {
        Class clazz = Office.class;
        Method[] mths = clazz.getDeclaredMethods();
        for (int i = 0; i < mths.length; i++)
        {
            String name = mths[i].getName();
            if (name.indexOf("set") != -1)
            {
                String val = name.replace("set", "");
                val = toLowerCaseFirstOne(val);
                Class<?>[] type = mths[i].getParameterTypes();
                for (Class<?> clas : type)
                {
                    String parameterName = clas.getName();
                    parameterName = parameterName.substring(parameterName.lastIndexOf(".") + 1, parameterName.length());
                    parameterName = parameterName.substring(parameterName.lastIndexOf("$") + 1, parameterName.length());
                    if ("BigInteger".equals(parameterName))
                    {
                        val = "Helper.String2BigInteger(" + val + ")";
                    }
                    else if ("BigDecimal".equals(parameterName))
                    {
                        val = "Helper.String2BigDecimal(" + val + ")";
                    }
                }
                System.out.println("office." + name + "(" + val + ");");

            }

        }
    }

    private static void read2()
    {
        Class clazz = OfficeTable.class;
        Method[] mths = clazz.getDeclaredMethods();
        for (int i = 0; i < mths.length; i++)
        {
            String name = mths[i].getName();
            if (name.indexOf("get") != -1)
            {
                String val = name.replace("get", "");
                val = toLowerCaseFirstOne(val);
                String type = mths[i].getReturnType().getName();
                if (type.indexOf("String") != -1)
                {
                    System.out.println("String " + val + "=row." + name + "();");
                }
            }

        }
        for (int i = 0; i < mths.length; i++)
        {
            String name = mths[i].getName();
            if (name.indexOf("get") != -1)
            {
                String val = name.replace("get", "");
                val = toLowerCaseFirstOne(val);
                String type = mths[i].getReturnType().getName();
                if (type.indexOf("String") != -1)
                {
                }
                else
                {
                    System.out.println("List<String> " + val + "List=row." + name + "();");
                }
            }

        }
    }

    private static void read1()
    {
        Class clazz = Office.class;
        Method[] mths = clazz.getDeclaredMethods();
        for (int i = 0; i < mths.length; i++)
        {
            String name = mths[i].getName();
            if (name.indexOf("set") != -1)
            {
                String val = name.replace("set", "");
                String valtoLower = toLowerCaseFirstOne(val);
                Class<?>[] type = mths[i].getParameterTypes();
                if (type.length > 1)
                {
                    System.out.println("参数有多个...");
                    return;
                }
                for (Class<?> clas : type)
                {
                    String parameterName = clas.getName();
                    parameterName = parameterName.substring(parameterName.lastIndexOf(".") + 1, parameterName.length());
                    String tmpe = parameterName.replace("$", ".");
                    parameterName = parameterName.substring(parameterName.lastIndexOf("$") + 1, parameterName.length());
                    if (!"BigInteger".equals(parameterName)
                            && !"String".equals(parameterName) & !"BigDecimal".equals(parameterName))
                    {
                        System.out.println("" + tmpe + " " + valtoLower + "=null;");
                        if (ex(clas))
                        {
                            one(valtoLower, clas, tmpe);
                        }
                        else
                        {
                            more(valtoLower, clas, tmpe);
                        }

                    }

                }

            }

        }
    }

    private static void one(String valtoLower, Class<?> clas, String tmpe)
    {
        System.out.println("if (" + valtoLower + "List != null){");
        System.out.println(valtoLower + " = new " + tmpe + "();");
        Method method = getGetMethodName(clas);
        method.getReturnType();
        ParameterizedType pt = (ParameterizedType) method.getGenericReturnType();
        Class type = (Class) pt.getActualTypeArguments()[0];
        String name = type.getName();
        name = name.substring(name.lastIndexOf(".") + 1, name.length());
        if (name.lastIndexOf("$") != -1)
        {
            name = name.substring(name.lastIndexOf("$") + 1, name.length());
        }
        if (name.equals("BigDecimal"))
        {
            System.out.println("for (String string : " + valtoLower + "List)" + "{");
            System.out.println(valtoLower + "." + method.getName() + "().add(Helper.String2BigDecimal(string));}");
        }
        else if (name.equals("BigInteger"))
        {
            System.out.println("for (String string : " + valtoLower + "List)" + "{");
            System.out.println(valtoLower + "." + method.getName() + "().add(Helper.String2BigInteger(string));}");
        }
        else
        {
            System.out.println(valtoLower + "." + method.getName() + "().addAll(" + valtoLower + "List);}");
        }
    }

    private static void more(String valtoLower, Class<?> clas, String tmpe)
    {
        String measure = valtoLower + "_measure";
        String unit = valtoLower + "_unit";
        if ("penPointSize".equals(valtoLower))
        {
            System.out.println();
        }
        System.out.println("if (" + measure + " != null && " + unit + " != null){");
        System.out.println(valtoLower + " = new " + tmpe + "();");
        for (Method method : getSetMethodName(clas))
        {
            String methodName = method.getName();
            String type = method.getParameterTypes()[0].getTypeName();
            type = type.substring(type.lastIndexOf(".") + 1, type.length());
            if (type.equals("BigDecimal"))
            {
                System.out.println(valtoLower + "." + methodName + "(Helper.String2BigDecimal(" + measure + "));");
            }
            else if (type.equals("BigInteger"))
            {
                System.out.println(valtoLower + "." + methodName + "(Helper.String2BigInteger(" + measure + "));");
            }
            else if (type.equals("String"))
            {
                System.out.println(valtoLower + "." + methodName + "(" + unit + ");}");
            }

        }
    }

    private static Method getGetMethodName(Class<?> clas)
    {
        Method[] methods = clas.getDeclaredMethods();
        for (int y = 0; y < methods.length; y++)
        {
            String nameM = methods[y].getName();
            if (nameM.indexOf("get") != -1)
            {
                return methods[y];
            }
        }
        return null;
    }

    private static List<Method> getSetMethodName(Class<?> clas)
    {
        List<Method> list = new ArrayList<Method>();
        Method[] methods = clas.getDeclaredMethods();
        for (int y = 0; y < methods.length; y++)
        {
            String nameM = methods[y].getName();
            if (nameM.indexOf("set") != -1)
            {
                list.add(methods[y]);
            }
        }
        return list;
    }

    private static Boolean ex(Class<?> clas)
    {
        Boolean mark = Boolean.FALSE;
        Field[] f = clas.getDeclaredFields();

        if (f.length == 1)
        {
            mark = Boolean.TRUE;
        }
        for (Field field : f)
        {
            field.setAccessible(true);
            String fieldType = field.getType().getSimpleName();
            if ("List".equals(fieldType))
            {
                mark = Boolean.TRUE;
            }
            else
            {
                mark = Boolean.FALSE;
            }
        }
        return mark;
    }

    /**
     * 首字母转小写
     * 
     * @param s
     * @return
     */
    public static String toLowerCaseFirstOne(String s)
    {
        if (Character.isLowerCase(s.charAt(0)))
            return s;
        else
            return (new StringBuilder()).append(Character.toLowerCase(s.charAt(0))).append(s.substring(1)).toString();
    }

}
