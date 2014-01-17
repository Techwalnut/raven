package com.raven.inc.utils;

import java.io.Serializable;


public class ServiceResponse<T> implements Serializable{

	private Long serialVersionUID = 1L;
	private Integer responseCode;
	private Boolean isSuccessful;
	private String message;
	
	public Integer getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}
	public Boolean getIsSuccessful() {
		return isSuccessful;
	}
	public void setIsSuccessful(Boolean isSuccessful) {
		this.isSuccessful = isSuccessful;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ServiceResponse [serialVersionUID=" + serialVersionUID
				+ ", responseCode=" + responseCode + ", isSuccessful="
				+ isSuccessful + ", message=" + message + "]";
	}
	
}
