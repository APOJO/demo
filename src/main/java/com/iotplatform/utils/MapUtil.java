

package com.iotplatform.utils;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class MapUtil {
    public MapUtil() {
    }

    private static String[] getPropertyNames(Object object) {
        Field[] fields = object.getClass().getDeclaredFields();
        String[] properties = new String[fields.length];

        for(int i = 0; i < fields.length; ++i) {
            properties[i] = fields[i].getName();
        }

        return properties;
    }

    private static Object getPropertyValueByName(Object object, String name) {
        try {
            String firstLetter = name.substring(0, 1).toUpperCase();
            String getter = "get" + firstLetter + name.substring(1);
            Method method = object.getClass().getMethod(getter);
            Object value = method.invoke(object);
            return value;
        } catch (Exception var6) {
            System.out.println("getPropertyValueByName " + var6.getMessage());
            return null;
        }
    }

    public static Map<String, String> makeMapByObject(Object object) {
        Map<String, String> queryParams = null;
        if (object != null) {
            queryParams = new HashMap();
            String[] propertyNames = getPropertyNames(object);
            String[] var6 = propertyNames;
            int var5 = propertyNames.length;

            for(int var4 = 0; var4 < var5; ++var4) {
                String string = var6[var4];
                Object value = getPropertyValueByName(object, string);
                if (value != null) {
                    queryParams.put(string, value.toString());
                }
            }
        }

        return queryParams;
    }

    public static Map<String, Object> makeMapByObject2(Object object) {
        Map<String, Object> queryParams = null;
        if (object != null) {
            queryParams = new HashMap();
            String[] propertyNames = getPropertyNames(object);
            String[] var6 = propertyNames;
            int var5 = propertyNames.length;

            for(int var4 = 0; var4 < var5; ++var4) {
                String string = var6[var4];
                Object value = getPropertyValueByName(object, string);
                if (value != null) {
                    queryParams.put(string, value.toString());
                }
            }
        }

        return queryParams;
    }

    public static Object convertMapToObject(Class type, Map map) throws IntrospectionException, IllegalAccessException, InstantiationException, InvocationTargetException {
        BeanInfo beanInfo = Introspector.getBeanInfo(type);
        Object obj = type.newInstance();
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();

        for(int i = 0; i < propertyDescriptors.length; ++i) {
            PropertyDescriptor descriptor = propertyDescriptors[i];
            String propertyName = descriptor.getName();
            if (map.containsKey(propertyName)) {
                Object value = map.get(propertyName);
                Object[] args = new Object[]{value};
                descriptor.getWriteMethod().invoke(obj, args);
            }
        }

        return obj;
    }
}
