package org.demo.junit_assertion_demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	private Calculator calculator= new Calculator();
	@Test
	public void testMultiplication()
	{
		assertEquals(20, calculator.multiplication(5, 4));
	}
	@Test
	public void testDivision()
	{
		assertEquals(1, calculator.division(5, 4));
	}
	@Disabled
	@Test
	public void testAddition()
	{
		assertEquals(9, calculator.addition(5, 4));
	}
	@Test
	public void testSubstraction()
	{
		assertEquals(1, calculator.substraction(5, 4));
	}
	
}
