package org.yelong.codec.binary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;

/**
 * Base64工具类
 * 
 * @since 1.1.1
 */
public final class Base64Utils {

	/**
	 * 默认的字符集
	 */
	public static String DEFAULT_CHARSET_NAME = "UTF-8";

	private Base64Utils() {
	}

	// ==================================================toBase64==================================================

	/**
	 * 转换为base64码
	 * 
	 * @param datas 需要被转换的数据
	 * @return 转换后的base64码数据
	 */
	public static byte[] toBase64(byte[] datas) {
		return Base64.encodeBase64(datas);
	}

	/**
	 * 转换为base64码
	 * 
	 * @param datas 需要被转换的数据
	 * @return 转换后的base64码数据的字符串形式
	 */
	public static String toBase64String(byte[] datas) {
		try {
			return new String(toBase64(datas), DEFAULT_CHARSET_NAME);
		} catch (UnsupportedEncodingException e) {
			return new String(toBase64(datas));
		}
	}

	/**
	 * 转换为base64码
	 * 
	 * @param datas 需要被转换的数据字符串
	 * @return 转换后的base64码数据的字符串形式
	 */
	public static String toBase64String(String datas) {
		try {
			return new String(toBase64(datas.getBytes(DEFAULT_CHARSET_NAME)), DEFAULT_CHARSET_NAME);
		} catch (UnsupportedEncodingException e) {
			return new String(toBase64(datas.getBytes()));
		}
	}

	/**
	 * 转换为base64码
	 * 
	 * @param inputStream 需要被转换的数据流
	 * @return 转换后的base64码数据的字符串形式
	 * @throws IOException 流异常
	 */
	public static String toBase64String(InputStream inputStream) throws IOException {
		return toBase64String(IOUtils.toByteArray(inputStream));
	}

	/**
	 * 将文件转化为Base64码数据
	 * 
	 * @param file 需要被转换的文件
	 * @return 转换后的base64码数据的字符串形式
	 * @throws IOException 流异常
	 */
	public static String toBase64String(File file) throws IOException {
		return toBase64String(new FileInputStream(file));
	}

	// ==================================================decodeBase64==================================================

	/**
	 * 将Base64码数据还原
	 * 
	 * @param base64Data 需要还原的base64码数据
	 * @return 还原后的base64码数据
	 */
	public static byte[] decodeBase64(byte[] base64Data) {
		return Base64.decodeBase64(base64Data);
	}

	/**
	 * 将Base64码的数据还原
	 * 
	 * @param base64DataString 需要还原的base64码数据字符串
	 * @return 还原后的base64码数据字符串
	 */
	public static String decodeBase64String(String base64DataString) {
		try {
			return new String(decodeBase64(base64DataString.getBytes(DEFAULT_CHARSET_NAME)), DEFAULT_CHARSET_NAME);
		} catch (UnsupportedEncodingException e) {
			return new String(decodeBase64(base64DataString.getBytes()));
		}
	}

}
