package com.jyoti;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Program6 {

	Calculator c1 = new Calculator();

	@Test(groups = { "group1", "group2" })
	public void testCaseForAddition() {
		int a = c1.addition(2, 3);
		Assert.assertEquals(a, 5);

	}

	@Test(groups = { "group1" })
	public void testCaseForSubstraction() {
		int a = c1.substraction(5, 3);
		Assert.assertEquals(a, 2);
		Assert.assertNotEquals(a, 3);

	}

	@Test(groups = { "group2" })
	public void testCaseForMultiplication() {
		int a = c1.multiplication(4, 3);
		Assert.assertEquals(a, 12);

	}

	@Test(groups = { "group1", "group2" })
	public void testCaseForDivision() {
		int a = c1.division(10, 2);
		Assert.assertEquals(a, 5);

	}

	@Test(groups = { "group1" })
	public void testCaseModulation() {
		int mod = c1.mod(14, 3);
		Assert.assertEquals(mod, 2);

	}

	@Test(groups = { "group1" })
	public void testCaseExp() {
		double exp1 = c1.exp(5, 3);
		Assert.assertEquals(exp1, 125.0);

	}

	@Test(groups = { "group2" })
	public void teseCaseForInverse() {
		double div = c1.inverse(2);
		Assert.assertEquals(div, 0.5);
	}

	@Test(groups = { "group1", "group2" })
	public void teseCaseForNegate() {
		int div = c1.negate(4);
		Assert.assertEquals(div, -4);

	}

}
