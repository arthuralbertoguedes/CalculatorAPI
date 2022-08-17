package br.com.agatec.calculatorAPI.domain;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public abstract class Calculator {

	public static BigDecimal sum(BigDecimal value1, BigDecimal value2) {
		return value1.add(value2);
	}
	
	public static BigDecimal multiply(BigDecimal value1, BigDecimal value2) {
		return value1.multiply(value2);
	}
	
	public static BigDecimal division(BigDecimal value1, BigDecimal value2) {
		MathContext mc = new MathContext(2, RoundingMode.HALF_UP) ;
		return value1.divide(value2,mc);
	}
	
	public static BigDecimal subtraction(BigDecimal value1, BigDecimal value2) {
		return value1.subtract(value2);
	}
	
}
