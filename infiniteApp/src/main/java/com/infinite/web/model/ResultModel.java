package com.infinite.web.model;

import org.apache.commons.lang.StringUtils;

/**
*
* 创建日期:2017年10月31日 下午3:51:31
* 创建作者：zijie.liu
* 文件名称：ResultModel.java
* 功能：
* 修改记录：
*/
public class ResultModel<T> {

	private int code;
	
	private T data;
	
	private String message;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public static <T> ResultModel<T> success(T data) {
        ResultModel<T> res = new ResultModel<T>();
        res.setCode(CodeEnum.SUCCESS.getCode());
        res.setData(data);
        res.setMessage(CodeEnum.SUCCESS.getDesc());
        return res;
    }

    public static <T> ResultModel<T> fail(CodeEnum codeEnum, String msg) {
        ResultModel<T> res = new ResultModel<T>();
        res.setCode(codeEnum.getCode());
        res.setMessage(StringUtils.isEmpty(msg) ? codeEnum.getDesc() : msg);
        return res;
    }
}
