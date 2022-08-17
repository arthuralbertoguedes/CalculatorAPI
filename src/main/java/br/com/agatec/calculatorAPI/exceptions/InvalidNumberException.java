package br.com.agatec.calculatorAPI.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidNumberException extends RuntimeException {

	public InvalidNumberException(String msg) {
		super(msg);
	}
	
}
