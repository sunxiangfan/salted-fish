package com.salted.fish.common.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {

	private static String hexDigits[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e",
			"f" };

	private MD5Util() {
	}

	public static String md5(byte b[]) throws NoSuchAlgorithmException {
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		md5.update(b, 0, b.length);
		return byteArrayToHexString(md5.digest());
	}

	public static String md5(String data) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		byte b[] = data.getBytes("UTF-8");
		md5.update(b, 0, b.length);
		return byteArrayToHexString(md5.digest());
	}

	private static String byteArrayToHexString(byte b[]) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < b.length; i++)
			sb.append(byteToHexString(b[i]));

		return sb.toString();
	}

	private static String byteToHexString(byte b) {
		int n = b;
		if (n < 0)
			n = 256 + n;
		int d1 = n / 16;
		int d2 = n % 16;
		return hexDigits[d1] + hexDigits[d2];
	}

	public static void main(String[] args) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getMd5Value(String sSecret) {
		try {
			MessageDigest bmd5 = MessageDigest.getInstance("MD5");
			bmd5.update(sSecret.getBytes());
			int i;
			StringBuffer buf = new StringBuffer();
			byte[] b = bmd5.digest();
			for (int offset = 0; offset < b.length; offset++) {
				i = b[offset];
				if (i < 0)
					i += 256;
				if (i < 16)
					buf.append("0");
				buf.append(Integer.toHexString(i));
			}
			return buf.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return "";
	}
}
