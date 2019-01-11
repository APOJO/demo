//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.iotplatform.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtil {
    private static Properties properties = null;

    public PropertyUtil() {
    }

    public static void init(String path) {
        properties = new Properties();
        BufferedReader bufferedReader = null;
        if (path == null) {
            try {
                bufferedReader = new BufferedReader(new FileReader("./application.yml"));
            } catch (FileNotFoundException var5) {
                System.out.println(var5.getMessage());
            }
        } else {
            try {
                bufferedReader = new BufferedReader(new FileReader(path));
            } catch (FileNotFoundException var4) {
                System.out.println(var4.getMessage());
            }
        }

        try {
            properties.load(bufferedReader);
        } catch (IOException var3) {
            System.out.println(var3.getMessage());
            properties = null;
        }

    }

    public static String getProperty(String key) {
        return properties == null ? null : properties.getProperty(key);
    }
}
