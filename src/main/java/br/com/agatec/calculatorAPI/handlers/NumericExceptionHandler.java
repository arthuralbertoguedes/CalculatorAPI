package br.com.agatec.calculatorAPI.handlers;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.agatec.calculatorAPI.exceptions.ExceptionResponse;
import br.com.agatec.calculatorAPI.exceptions.InvalidNumberException;

@ControllerAdvice
@RestController
public class NumericExceptionHandler extends ResponseEntityExceptionHandler {

	/*
	 * Método que captura todas exceções genéricas e retorna a exceção personalizado ExceptionResponse
	 */
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ExceptionResponse> handleAllExceptions(Exception ex, WebRequest request) {
		ExceptionResponse exceptionResponse = 
				new ExceptionResponse(
						ex.getMessage(), 
						LocalDateTime.now(),
						request.getContextPath());
		return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(InvalidNumberException.class)
	public final ResponseEntity<ExceptionResponse> handleInvalidNumberException(Exception ex, WebRequest request) {
		ExceptionResponse exceptionResponse = 
				new ExceptionResponse(
						ex.getMessage(), 
						LocalDateTime.now(),
						request.getContextPath());
		return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public final ResponseEntity<ExceptionResponse> handleMethodArgumentTypeMismatchException(MethodArgumentTypeMismatchException ex) {
		String msg = "Parâmetro %s inválido. Por favor, utilizar pontos %s para separar as casas decimais.";
		msg = msg.format(msg, ex.getValue(),"(.)");
		ExceptionResponse exceptionResponse = 
				new ExceptionResponse(
						msg, 
						LocalDateTime.now(),
						"");
		return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(ArithmeticException.class)
	public final ResponseEntity<ExceptionResponse> handleArithmeticException(ArithmeticException ex) {
		String msg = "Operação inválida.";
		ExceptionResponse exceptionResponse = 
				new ExceptionResponse(
						msg, 
						LocalDateTime.now(),
						"");
		return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
	}
	
	
	
	
	
	
	
}
