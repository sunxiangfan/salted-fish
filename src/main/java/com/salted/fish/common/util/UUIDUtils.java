package com.salted.fish.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UUIDUtils {

    public static String getUserId() {
        String str = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
        int intFlag = (int) (Math.random() * 100000);
        str = str + intFlag + "U";
        return str;
    }
}
