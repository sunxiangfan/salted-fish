package com.salted.fish.common.util;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

/**
 * 公共工具类
 *
 */
public class CommUtils {

	/**
	 * 判断对象是否为NULL
	 *
	 * @param obj 任意对象
	 * @return boolean true 对象为NULL false 对象不为空
	 */
	@SuppressWarnings("rawtypes")
	public static boolean isNull(Object obj) {
		boolean result = false;
		if (obj != null) {
			if (obj instanceof String) {
				if (((String) obj).trim().isEmpty() || ((String) obj).trim().equals("undefined") || ((String) obj).trim().equals("null")) {
					result = true;
				}
			} else if (obj instanceof Collection) {
				if (((Collection) obj).isEmpty()) {
					result = true;
				}
			} else if (obj instanceof Map) {
				if (((Map) obj).isEmpty()) {
					result = true;
				}
			} else if (obj.getClass().isArray()) {
				if (Array.getLength(obj) <= 0) {
					return true;
				}
			}

		} else {
			result = true;
		}
		return result;
	}

	public static String isNumber(Object obj) {
		if (obj != null) {
			return obj.toString();
		} else {
			return "0";
		}
	}

	public static String toString(Object obj) {
		if (obj != null) {
			return obj.toString();
		} else {
			return "";
		}
	}

	/**
	 * 校验手机号
	 * @param str
	 * @return
	 * @throws PatternSyntaxException
	 */
	public static boolean isChinaPhoneLegal(String str) throws PatternSyntaxException {
		String regExp = "^((13[0-9])|(15[^4])|(18[0,2,3,5-9])|(17[0-8])|(147))\\d{8}$";
		Pattern p = Pattern.compile(regExp);
		Matcher m = p.matcher(str);
		return m.matches();
	}

	/**
	 * 获得一个UUID
	 *
	 * @return String UUID
	 */
	public static String getUUID() {
		String s = UUID.randomUUID().toString();
		// 去掉“-”符号
		return s.substring(0, 8) + s.substring(9, 13) + s.substring(14, 18) + s.substring(19, 23) + s.substring(24);
	}

	/**
	 * MD5加密
	 *
	 * @param source 待产生MD5的byte数组
	 * @return String MD5值
	 */
	public static String getMD5(byte[] source) {
		String s = null;
		// 用来将字节转换成16进制表示的字符
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
		try {
			java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
			md.update(source);
			byte tmp[] = md.digest();
			char ch[] = new char[16 * 2];
			int k = 0;
			for (int i = 0; i < 16; i++) {
				byte byte0 = tmp[i];
				ch[k++] = hexDigits[byte0 >>> 4 & 0xf];
				ch[k++] = hexDigits[byte0 & 0xf];
			}
			s = new String(ch);
		} catch (Exception ex) {
			Logger.getLogger(CommUtils.class.getName()).log(Level.SEVERE, null, ex);
		}
		return s;
	}

	/**
	 * 根据给定的日期格式将日期字符串解析为日期对象
	 *
	 * @param dateString 日期字符串
	 * @param pattern 给定的日期格式,如果为NULL则默认使用yyyy-MM-dd
	 * @return Date 解析后的日期
	 */
	public static Date convertStringToDate(String dateString, String pattern) {
		Date date = null;
		if (pattern == null || pattern.trim().equals("")) {
			pattern = "yyyy-MM-dd";
		}
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		try {
			date = sdf.parse(dateString);
		} catch (ParseException ex) {
			Logger.getLogger(CommUtils.class.getName()).log(Level.SEVERE, null, ex);
		}
		return date;
	}

	/**
	 * 根据给定的日期格式将日期解析为日期字符串
	 *
	 * @param date 日期
	 * @param pattern 给定的日期格式,如果为NULL则默认使用yyyy-MM-dd
	 * @return String 解析后的日期字符串
	 */
	public static String convertDateToString(Date date, String pattern) {
		String dateString;
		if (pattern == null || pattern.trim().equals("")) {
			pattern = "yyyy-MM-dd";
		}
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		dateString = sdf.format(date);
		return dateString;
	}

	/**
	 * 比较两个日期是否相等
	 *
	 * @param d1 日期
	 * @param d2 日期
	 * @param pattern 给定的日期格式,如果为NULL则默认使用yyyy-MM-dd hh:mm:ss yyyy-MM-dd hh:mm:ss
	 * @return true 相等，false 不等
	 */
	public static boolean compareDate(Date d1, Date d2, String pattern) {
		boolean result = false;
		if (d1 != null && d2 != null) {
			String date1 = convertDateToString(d1, pattern);
			String date2 = convertDateToString(d2, pattern);

			if (date1.equals(date2)) {
				result = true;
			}
		}

		return result;
	}

	/**
	 * 提供（相对）精确的除法运算。当发生除不尽的情况时，由scale参数指定精度，以后的数字四舍五入。
	 *
	 * @param v1 被除数
	 * @param v2 除数
	 * @param scale 表示表示需要精确到小数点以后几位。
	 * @return 两个参数的商
	 */
	public static double div(double v1, double v2, int scale) {
		if (scale < 0) {
			throw new IllegalArgumentException("The scale must be a positive integer or zero");
		}
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

	/**
	 * 正则表达式验证
	 *
	 * @param dataType 1:邮箱 2:日期 3:电话号码 4:数字
	 * @param data
	 * @return
	 */
	public static boolean validate(int dataType, String data) {
		String regexStr = "";
		switch (dataType) {
		case 1:
			regexStr = "^([a-zA-Z0-9]*[-_]?[a-zA-Z0-9]+)*@([a-zA-Z0-9]*[-_]?[a-zA-Z0-9]+)+[\\.][A-Za-z]{2,3}([\\.][A-Za-z]{2})?$";
			break;
		case 2:
			regexStr = "^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))(\\s(((0?[0-9])|([1-2][0-3]))\\:([0-5]?[0-9])((\\s)|(\\:([0-5]?[0-9])))))?$";
			break;
		case 3:
			regexStr = "(\\d{11})|^((\\d{7,8})|(\\d{4}|\\d{3})-(\\d{7,8})|(\\d{4}|\\d{3})-(\\d{7,8})-(\\d{4}|\\d{3}|\\d{2}|\\d{1})|(\\d{7,8})-(\\d{4}|\\d{3}|\\d{2}|\\d{1}))$";
			break;
		case 4:
			regexStr = "-?(0|([1-9][0-9]*))(.[0-9]+)?";
			break;
		}
		Pattern pattern = Pattern.compile(regexStr);
		Matcher matcher = pattern.matcher(data);
		return matcher.matches();
	}

	/**
	 * 获取客户端真实IP
	 *
	 * @param request
	 * @return
	 */
	public static String getIpAddr(HttpServletRequest request) {
		String ip = request.getHeader("X-Forwarded-For");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_CLIENT_IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_X_FORWARDED_FOR");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}

	/**
	 * 生成随机多位数字
	 *
	 * @return
	 */
	public static String getRandomNumber(int num) {
		Random random = new Random();
		StringBuilder randomCode = new StringBuilder();
		for (int i = 0; i < num; i++) {
			// 得到随机产生的验证码数字。
			String strRand = String.valueOf(random.nextInt(10));
			// 将产生的多个随机数组合在一起。
			randomCode.append(strRand);
		}
		return randomCode.toString();
	}

	public static String formatterPhone(String phone) {
		if (!CommUtils.isNull(phone)) {

			return phone.substring(0, 3) + "****" + phone.substring(phone.length() - 4);
		}
		return "";
	}

	public static String formatterIdCard(String idCard) {
		if (!CommUtils.isNull(idCard)) {

			return idCard.substring(0, 3) + "****" + idCard.substring(idCard.length() - 4);
		}
		return "";
	}

	public static String filterEmoji(String source) {
		if (source != null) {
			Pattern emoji = Pattern.compile("[\ud83c\udc00-\ud83c\udfff]|[\ud83d\udc00-\ud83d\udfff]|[\u2600-\u27ff]",
					Pattern.UNICODE_CASE | Pattern.CASE_INSENSITIVE);
			Matcher emojiMatcher = emoji.matcher(source);
			if (emojiMatcher.find()) {
				source = emojiMatcher.replaceAll("*");
				return source;
			}
			return source;
		}
		return source;
	}

	public static String[] getNullPropertyNames(Object source) {
		final BeanWrapper src = new BeanWrapperImpl(source);
		java.beans.PropertyDescriptor[] pds = src.getPropertyDescriptors();

		Set<String> emptyNames = new HashSet<String>();
		for (java.beans.PropertyDescriptor pd : pds) {
			Object srcValue = src.getPropertyValue(pd.getName());
			if (srcValue == null)
				emptyNames.add(pd.getName());
		}
		String[] result = new String[emptyNames.size()];
		return emptyNames.toArray(result);
	}

	public static void copyPropertiesIgnoreNull(Object src, Object target) {
		BeanUtils.copyProperties(src, target, getNullPropertyNames(src));
	}

	public static Integer[] checkIdCard(String idCard) {
		Integer[] Ins = new Integer[2];
		if (idCard != null) {
			Integer age = 0;
			// 0 女 1 男
			Integer sex = 0;
			if (idCard.length() == 18) {
				sex = Integer.parseInt(idCard.substring(idCard.length() - 2, idCard.length() - 1)) % 2 == 0 ? 0 : 1;
				age = Calendar.getInstance().get(Calendar.YEAR) - Integer.parseInt(idCard.substring(6, 10));
			} else {
				sex = Integer.parseInt(idCard.substring(idCard.length() - 1, idCard.length())) % 2 == 0 ? 0 : 1;
				age = Calendar.getInstance().get(Calendar.YEAR) - Integer.parseInt("19" + idCard.substring(6, 8));
			}

			Ins[0] = age;
			Ins[1] = sex;
		}
		return Ins;
	}

	/**
	 * 相差秒数
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public static Long getMillisBetween(Date startDate, Date endDate) {
		Calendar d1 = Calendar.getInstance();
		d1.setTime(startDate);
		Calendar d2 = Calendar.getInstance();
		d2.setTime(endDate);
		Long min = 0L;
		if (d1.getTimeInMillis() > d2.getTimeInMillis()) {
			min = (d1.getTimeInMillis() - d2.getTimeInMillis()) / 1000;
		} else {
			min = (d2.getTimeInMillis() - d1.getTimeInMillis()) / 1000;
		}
		return min;
	}

	public static void main(String[] args) {
		// System.out.println(CommUtils.getMD5("123456".getBytes()));
		// String uuid = CommUtils.getUUID();
		/*
		 * System.out.println(uuid + ".length = " + uuid.length()); String signature = SecurityUtils.sign(
		 * "15623060179|0002900F0041080|11032302065863805555|http://www.baidu.com" ); System.out.println(signature);
		 * System.out.println(CommUtils.getRandomNumber(6));
		 */
		String idcard = "undefined";
		boolean n  = isNull(idcard);
		System.out.println(n);
//		System.out.println(Ins[0] + "ssss" + Ins[1]);
//		System.out.println((new Long("12312").toString()));
	}
}
