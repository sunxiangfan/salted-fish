package com.salted.fish.common.util;

import java.io.IOException;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class DesHelper {

	private final static String DES = "DES";

	private static byte[] iv1 = { 'm', 'e', 'i', 'y', 'o', 'u', 'z', 'y' };

	private static String key = "meiyouzy";

	/**
	 * Description 根据键值进行加密
	 * 
	 * @param data
	 * @param key 加密键byte数组
	 * @return
	 * @throws Exception
	 */
	public static String encrypt(String data, String key) throws Exception {
		byte[] bt = encrypt(data.getBytes(), key.getBytes());
		String strs = Base64.getEncoder().encodeToString(bt);
		return strs;
	}

	/**
	 * Description 根据键值进行解密
	 * 
	 * @param data
	 * @param key 加密键byte数组
	 * @return
	 * @throws IOException
	 * @throws Exception
	 */
	public static String decrypt(String data, String key) throws IOException, Exception {
		if (data == null)
			return null;
		byte[] buf = Base64.getDecoder().decode(data);
		byte[] bt = decrypt(buf, key.getBytes());
		return new String(bt);
	}

	/**
	 * Description 根据键值进行加密
	 * 
	 * @param data
	 * @param key 加密键byte数组
	 * @return
	 * @throws Exception
	 */
	public static byte[] encrypt(byte[] data, byte[] key) throws Exception {
		// 从原始密钥数据创建DESKeySpec对象
		DESKeySpec dks = new DESKeySpec(key);
		// 创建一个密钥工厂，然后用它把DESKeySpec转换成SecretKey对象
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES);
		SecretKey securekey = keyFactory.generateSecret(dks);
		// Cipher对象实际完成加密操作
		Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
		IvParameterSpec iv = new IvParameterSpec(iv1);
		// 用密钥初始化Cipher对象
		cipher.init(Cipher.ENCRYPT_MODE, securekey, iv);
		return cipher.doFinal(data);
	}

	/**
	 * Description 根据键值进行解密
	 * 
	 * @param data
	 * @param key 加密键byte数组
	 * @return
	 * @throws Exception
	 */
	public static byte[] decrypt(byte[] data, byte[] key) throws Exception {
		// 从原始密钥数据创建DESKeySpec对象
		DESKeySpec dks = new DESKeySpec(key);

		// 创建一个密钥工厂，然后用它把DESKeySpec转换成SecretKey对象
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES);
		SecretKey securekey = keyFactory.generateSecret(dks);

		// Cipher对象实际完成解密操作
		Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");

		IvParameterSpec iv = new IvParameterSpec(iv1);

		// 用密钥初始化Cipher对象
		cipher.init(Cipher.DECRYPT_MODE, securekey, iv);

		return cipher.doFinal(data);
	}

	public static void main(String[] args) {
		String phone = "13512312333";
		try {
			System.out.println(encrypt(phone, key));
			System.out.println(DesHelper.decrypt("FFWfgVOce5yBACAf1pS55Q==", key));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
