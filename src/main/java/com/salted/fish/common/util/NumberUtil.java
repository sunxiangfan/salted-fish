
package com.salted.fish.common.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * 
 * 
 * Module:
 * 
 * NumberUtil.java
 *
 * @since JDK 1.8
 * @version 1.0
 * @description: <描述>
 */
public class NumberUtil {

	public static final String DEFAULT_FORMAT_DECIMAL = "######0.00";

	public static boolean isFushu(String str) {
		int i = new BigDecimal(str).compareTo(new BigDecimal("0"));
		return i <= 0 ? true : false;
	}

	public static boolean isLarge(String left, String right) {
		int i = new BigDecimal(left).compareTo(new BigDecimal(right));
		return i >= 0 ? true : false;
	}

	/**
	 * 格式化金额为0.00格式
	 * 
	 * @param money
	 * @return
	 */
	public static String formatDecimal(Double money) {
		DecimalFormat df = new DecimalFormat(DEFAULT_FORMAT_DECIMAL);
		return df.format(money);
	}

	/**
	 * 字符串转Long
	 * 
	 * @param longStr
	 * @param defaultLong 转换失败则返回defaultLong
	 * @return
	 */
	public static Long parseLong(String longStr, Long defaultLong) {
		Long parseLong = defaultLong;
		try {
			parseLong = Long.parseLong(longStr);
		} catch (Exception e) {
		}
		return parseLong;
	}

	/**
	 * 字符串转Integer
	 * 
	 * @param integerStr
	 * @param defaultLong 转换失败则返回defaultInteger
	 * @return
	 */
	public static Integer parseInteger(String integerStr, Integer defaultInteger) {
		Integer parseInteger = defaultInteger;
		try {
			parseInteger = Integer.parseInt(integerStr);
		} catch (Exception e) {
		}
		return parseInteger;
	}

	/**
	 * 字符串转Double
	 * 
	 * @param doubleStr
	 * @param defaultDouble 转换失败则返回defaultDouble
	 * @return
	 */
	public static Double parseDouble(String doubleStr, Double defaultDouble) {
		Double parseDouble = defaultDouble;
		try {
			parseDouble = Double.parseDouble(doubleStr);
		} catch (Exception e) {
		}
		return parseDouble;
	}

	/**
	 * double转int类型 转换失败则返回defaultDouble
	 * 
	 * @param args
	 */
	public static Integer parseInt(Double doubleM, Integer defaultDouble) {
		Integer parseInt = defaultDouble;
		try {
			parseInt = (int) (doubleM / 1);
		} catch (Exception e) {
		}
		return parseInt;
	}

	public static void main(String[] args) {
		System.out.println(NumberUtil.parseInt(5.00, null));
	}

}
