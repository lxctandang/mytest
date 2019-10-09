package com.example.demo.exception;

/**
 *     自定义异常
 * @author hasee
 *
 */
public class MyException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	private StatusMessage  statusMessage;

	// 有参构造方法  -- 创建异常时,提供创建信息。
	public MyException(StatusMessage statusMessage) {
		// 将异常信息写入到异常的Message信息中。
		super(statusMessage.toString());
		this.statusMessage = statusMessage;
	}

	public StatusMessage getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(StatusMessage statusMessage) {
		this.statusMessage = statusMessage;
	}
	
	
	
}
