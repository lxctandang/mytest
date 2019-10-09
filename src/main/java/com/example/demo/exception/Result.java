package com.example.demo.exception;

import java.util.Date;

/**
 *      返回给浏览器的json结果,本想使用泛型接受各个异常处理结果，但是在这个未使用。
 * @author hasee
 *
 */
public class Result<T> {
	// 状态码   
	private int status;

	// 每个状态码的描述信息
	private String message;
	
	// 定义每个异常创建的时间
	private Date createDate;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Result(int status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
}
