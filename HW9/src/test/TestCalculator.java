package test;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

import main.Calculator;


class TestCalculator {

	Calculator calculator = new Calculator();

	@Test
	public void Should_add_two_numbers_and_return_result() {
		int valueOne = 9;
		int valueTwo = 10;
		Calculator calc = new Calculator();
		assertEquals(valueOne + valueTwo, calc.add(valueOne, valueTwo));
	}

	@ParameterizedTest
	@CsvSource({"1,2", "89, 6", "44, 9", "35, 76"})
	public void Should_add_two_numbers_and_return_result_parameterized(int valueOne, int valueTwo) {
		Calculator calc = new Calculator();
		assertEquals(valueOne + valueTwo, calc.add(valueOne, valueTwo));
	}
	
	@Test
	public void Should_substract_two_numbers_and_return_result() {
		int valueOne = 9;
		int valueTwo = 10;
		Calculator calc = new Calculator();
		assertEquals(valueOne - valueTwo, calc.sub(valueOne, valueTwo));
	}
	
	@Test
	public void Should_multiply_two_numbers_and_return_result() {
		int valueOne = 9;
		int valueTwo = 10;
		Calculator calc = new Calculator();
		assertEquals(valueOne * valueTwo, calc.multiply(valueOne, valueTwo));
	}
	
	@Test
	public void Should_divide_two_numbers_and_return_result() {
		int valueOne = 9;
		int valueTwo = 10;
		Calculator calc = new Calculator();
		assertEquals(((float)valueOne/(float)valueTwo), calc.divide(valueOne, valueTwo));
	}
	
	@Test
	public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
		Calculator calc = new Calculator();
		ArithmeticException thrown = Assertions.assertThrows(ArithmeticException.class, () -> calc.divide(1,  0));
		assertEquals("/ by zero", thrown.getMessage());
	}
}
