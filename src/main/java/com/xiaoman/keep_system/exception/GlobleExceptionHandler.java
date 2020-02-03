package com.xiaoman.keep_system.exception;

import com.xiaoman.keep_system.result.CodeMsg;
import com.xiaoman.keep_system.result.Result;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.net.BindException;

@ControllerAdvice(basePackages = "com.xiaoman.keep_system.controller")
@ResponseBody
public class GlobleExceptionHandler {
	@ExceptionHandler(value = Exception.class)
	public Result<String> exceptionHandler(HttpServletRequest request, Exception e) {

		if (e instanceof BindException) {//绑定异常（端口被占用，通常出现在启动服务的时候）
			e.printStackTrace();
			BindException exception = (BindException) e;
			//异常信息
			String message = exception.getMessage();
			return Result.error(CodeMsg.BIND_ERROR.fillArgs(message));
		} else if (e instanceof GlobleException) {
			GlobleException exception = (GlobleException) e;
			return Result.error(exception.getCm());

//		} else {
//			return Result.error(CodeMsg.SERVER_ERROR);
		} else if (e instanceof UnauthorizedException){
			e.printStackTrace();
			UnauthorizedException exception = (UnauthorizedException) e;
			return Result.error(CodeMsg.PASSWORD_ERROR.fillArgs(exception.getMessage()));
		} else if (e instanceof AuthorizationException){
			e.printStackTrace();
			AuthorizationException exception = (AuthorizationException) e;
			return Result.error(CodeMsg.NOT_LOGIN.fillArgs(exception.getMessage()));
		} else if (e instanceof UnauthenticatedException){
			e.printStackTrace();
			UnauthenticatedException exception = (UnauthenticatedException) e;
			return Result.error(CodeMsg.NOT_LOGIN.fillArgs(exception.getMessage()));
		} else {
			e.printStackTrace();
		}
		return null;
	}
}
