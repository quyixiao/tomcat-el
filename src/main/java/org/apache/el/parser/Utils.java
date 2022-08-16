package org.apache.el.parser;


import com.sun.org.apache.xml.internal.utils.NameSpace;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Utils {

    static Window splashScreen;


    public static void endSplashScreen() {
        if (splashScreen != null)
            splashScreen.dispose();
    }

    public static boolean eq(String value, String... str) {
        for (String s : str) {
            if (!s.equals(value)) {
                return false;
            }
        }
        return true;
    }

    public static boolean notEq(String value, String... str) {
        return !eq(value, str);
    }

    public static boolean eqOR(String value, String... str) {
        for (String s : str) {
            if (s.equals(value)) {
                return true;
            }
        }
        return false;
    }


    public static Object getFromMap(Map<String, Object> map, String name) {
        return map == null ? null : map.get(name);
    }
}
