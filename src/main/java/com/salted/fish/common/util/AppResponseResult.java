package com.salted.fish.common.util;

/**
 * 服务器响应app结果对象
 *
 *
 */
public class AppResponseResult {

	/**
	 * 服务器响应编号
	 */
	private String code;
	/**
	 * 服务器响应消息
	 */
	private String msg;
	/**
	 * 服务器响应结果对象
	 */
	private Object result;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

}
