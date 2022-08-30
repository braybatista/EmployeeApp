package com.bbatista.thales.model;

public class ResponseSingle {

	String status;
	
	Employee data;
	
	String message;

	public ResponseSingle() {
		super();
	}

	public ResponseSingle(String status, Employee data, String message) {
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

	public Employee getData() {
		return data;
	}

	public void setData(Employee data) {
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
		return "ResponseSingle [status=" + status + ", data=" + data + ", message=" + message + "]";
	}
}
