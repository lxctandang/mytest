package com.example.demo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 异常处理器，接收异常，对异常进行处理后，返回结果信息给前端控制器。
 * @author hasee
 *
 */
@ControllerAdvice
// 将返回的结果定义成一个json数据返回给客户端。
@ResponseBody
public class MyExceptionHandler {
	// 定义异常处理器
	@ExceptionHandler(value = Exception.class)
	public StatusMessage exceptionHandler(Exception e) {
		if(e instanceof MyException) {
			MyException my = (MyException)e;
			return my.getStatusMessage();
		}
		else {
			String message = e.getMessage();
			return new StatusMessage(4001,message);
		}
	}
}
