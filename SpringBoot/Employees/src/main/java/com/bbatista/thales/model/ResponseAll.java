package com.bbatista.thales.model;

import java.util.List;

public class ResponseAll {
	
	String status;
	
	List<Employee> data;
	
	String message;

	public ResponseAll() {
		super();
	}

	public ResponseAll(String status, List<Employee> data, String message) {
		super();
		this.status = status;
		this.data = data;
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Employee> getData() {
		return data;
	}

	public void setData(List<Employee> data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ResponseAll [status=" + status + ", data=" + data + ", message=" + message + "]";
	}

}
