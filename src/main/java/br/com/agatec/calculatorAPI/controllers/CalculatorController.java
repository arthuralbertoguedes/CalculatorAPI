package br.com.agatec.calculatorAPI.controllers;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.agatec.calculatorAPI.domain.Calculator;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

	
	//Apenas para teste. Exemplo de chamada enviando o requestParam
	//http://localhost:8080/calculator/start?start=true
	//http://localhost:8080/calculator/start?start=false
	@GetMapping(value="/start")
	public String start(@RequestParam(value="start",defaultValue="true") Boolean start) {
		System.out.println(start);
		if(Boolean.valueOf(start)) {
			return "Calculadora Iniciada";
		}
		else {
			return "Calculadora não iniciada.";
		}
	}
	
	@GetMapping(value="sum/{value1}/{value2}")
	public BigDecimal sum(@PathVariable("value1") BigDecimal value1, @PathVariable("value2") BigDecimal value2) {
		return Calculator.sum(value1, value2);
	}
	
	@GetMapping(value="multiply/{value1}/{value2}")
	public BigDecimal multiply(@PathVariable("value1") BigDecimal value1, @PathVariable("value2") BigDecimal value2) {
		return Calculator.multiply(value1, value2);
	}
	
	@GetMapping(value="division/{value1}/{value2}")
	public BigDecimal division(@PathVariable("value1") BigDecimal value1, @PathVariable("value2") BigDecimal value2) {
		return Calculator.division(value1, value2);
	}
	
	@GetMapping(value="subtract/{value1}/{value2}")
	public BigDecimal subtraction(@PathVariable("value1") BigDecimal value1, @PathVariable("value2") BigDecimal value2) {
		return Calculator.subtraction(value1, value2);
	}
}
