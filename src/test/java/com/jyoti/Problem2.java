package com.jyoti;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;


public class Problem2 {

	Calculator c1 = new Calculator();

	@DataProvider(name = "test")
	public static Object[][] params() {
		return new Object[][] { { 2, 2 }, { 6, 4 } };
	}

	@Test(dataProvider = "test")
	public void addition(Integer a, Integer b) {

		int s = c1.addition(a, b);
		System.out.println("sum of two num is --- " + s);

	}

	@Test(dataProvider = "test")
	public void substraction(Integer a, Integer b) {

		int s = c1.substraction(a, b);
		System.out.println("substraction of two num is --- " + s);

	}

	@Test(dataProvider = "test")
	public void multiplication(Integer a, Integer b) {

		int s = c1.multiplication(a, b);
		System.out.println("mul of two num is --- " + s);

	}

	@Test(dataProvider = "test")
	public void division(Integer a, Integer b) {

		int s = c1.division(a, b);
		System.out.println("div of two num is --- " + s);

	}

	@Test(dataProvider = "test")
	public void testCaseModulation(int a, int b) {
		int mod = c1.mod(a, b);
		System.out.println("modulation of two num is " + mod);
		//Assert.assertEquals(mod, 2);

	}

	@Test(dataProvider = "test")
	public void testCaseExp(int a, int b) {
		double exp1 = c1.exp(a, b);
		System.out.println("exponetial of two num is " + exp1);

	}

	@Test
	public void teseCaseForInverse() {
		double div = c1.inverse(2);
		System.out.println("inverse of  num is " + div);
	}

	@Test
	public void teseCaseForNegate() {
		int div = c1.negate(4);
		System.out.println("negation of num is " + div);

	}
}
