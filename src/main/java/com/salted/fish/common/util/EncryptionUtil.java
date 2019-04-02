package com.salted.fish.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Module:
 * <p>
 * EncryptionUtil.java
 *
 * @version 1.0
 * @description: <描述>
 * @since JDK 1.8
 */
public class EncryptionUtil {

    private static Logger logger = LoggerFactory.getLogger(EncryptionUtil.class);

    private static String key = "meiyouzy";

    private static String keyForH5 = "zyemeiyou";

    public static String getPhone(String phone) {
        try {
            phone = DesHelper.decrypt(phone, key);
            return phone;
        } catch (Exception e) {
            logger.error("电话号码解密错误,原始电话号码：" + phone, e);
            return null;
        }
    }


    public static String getPhoneForH5(String phone) {
        try {
            phone = DESUtilForH5.decryption(phone, keyForH5);
            return phone;
        } catch (Exception e) {
            logger.error("电话号码解密错误,原始电话号码：" + phone, e);
            return null;
        }
    }


}