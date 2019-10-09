package com.example.demo.exception;

/**
 *    定义一个规范，在程序运行时，会出现的各种异常问题。
 * @author hasee
 *
 */
public class StatusMessage {
	// 状态码   
	private int status;

	// 每个状态码的描述信息
	private String message;
	
	// 定义各种异常情况
	// 通用异常  比如空指针异常等
	public static final StatusMessage System_ERROR = new StatusMessage(4001, "系统异常");
	
	// 登录模块
	public static final StatusMessage UERS_NOT_EXISt = new StatusMessage(5001, "用户不存在");
	public static final StatusMessage UERS_LOGIN_ERROR = new StatusMessage(5002, "用户信息错误");
	
	// 注册模块
	public static final StatusMessage UERS_EXIST = new StatusMessage(7001, "用户已存在");
	
	// 订购模块
	public static final StatusMessage GOODS_ORDER_FAIL = new StatusMessage(8001,"产品订购失败");
	
	// 发送信息模块
	public static final StatusMessage SEND_INFORMATION = new StatusMessage(9001,"信息发送失败");
	
	// 有参构造方法  
	public StatusMessage(int status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

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
	
	@Override
	public String toString() {
		return "StatusMessage [status=" + status + ", message=" + message + "]";
	}
}
