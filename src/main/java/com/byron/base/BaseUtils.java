package com.byron.base;

import com.byron.db.DbUtils;
import com.byron.net.NetUtils;

public class BaseUtils {
    public static String getNetHello(){
        return NetUtils.getHello();
    }

    public static String getDbHello(){
        return DbUtils.getHello();
    }

    public static String getBaseHello() {
        return "I am base";
    }
}
