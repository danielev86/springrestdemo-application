package com.firm.restdemo.rest.controller.dto;

import java.io.Serializable;

public class Response<T> implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private boolean result;
	
	private T bodyResult;

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public T getBodyResult() {
		return bodyResult;
	}

	public void setBodyResult(T bodyResult) {
		this.bodyResult = bodyResult;
	}

}
