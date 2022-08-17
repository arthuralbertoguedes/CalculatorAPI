package br.com.agatec.calculatorAPI.exceptions;

import java.time.LocalDateTime;

public class ExceptionResponse {

	private String msg;
	private LocalDateTime date;
	private String url;
	
	public ExceptionResponse(String msg, LocalDateTime date, String url) {
		this.msg = msg;
		this.date = date;
		this.url = url;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
}
