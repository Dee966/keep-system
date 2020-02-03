package com.xiaoman.keep_system.exception;


import com.xiaoman.keep_system.result.CodeMsg;

public class GlobleException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	private CodeMsg cm;

	public GlobleException(CodeMsg cm) {
		super(cm.toString());
		this.cm = cm;
	}

	public GlobleException(CodeMsg cm, String url){
		super(cm.toString());
		this.cm = cm;
	}

	public CodeMsg getCm() {
		return cm;
	}
}
