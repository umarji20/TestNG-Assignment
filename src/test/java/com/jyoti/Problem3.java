package com.jyoti;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Problem3 {

	Calculator c1 = new Calculator();

	@Test
	@Parameters({ "a", "b" })
	public void testCaseForAddition(int a, int b) {
		int sum = c1.addition(a, b);
		Assert.assertEquals(sum, 8);

	}

	@Test
	@Parameters({ "a", "b" })
	public void testCaseForSubstraction(int a, int b) {
		int sub = c1.substraction(a, b);
		Assert.assertEquals(sub, 2);

	}

	@Test
	@Parameters({ "a", "b" })
	public void testCaseForMultiplication(int a, int b) {
		int mul = c1.multiplication(a, b);
		Assert.assertEquals(mul, 15);

	}

	@Test
	@Parameters({ "a", "b" })
	public void testCaseForDivision(int a, int b) {
		int div = c1.division(a, b);
		Assert.assertEquals(div, 1);

	}

	@Test
	@Parameters({ "a", "b" })
	public void testCaseModulation(int a, int b) {
		int mod = c1.mod(a, b);
		Assert.assertEquals(mod, 2);

	}

	@Test
	@Parameters({ "a", "b" })
	public void testCaseExp(int a, int b) {
		double exp1 = c1.exp(a, b);
		Assert.assertEquals(exp1, 125.0);

	}

	@Test
	@Parameters({ "a" })
	public void teseCaseForInverse(int a) {
		double div = c1.inverse(a);
		Assert.assertEquals(div, 0.2);

	}

	@Test
	@Parameters({ "a" })
	public void teseCaseForNegate(int a) {
		int div = c1.negate(a);
		Assert.assertEquals(div, -5);

	}

}
