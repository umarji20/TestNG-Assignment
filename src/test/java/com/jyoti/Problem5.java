package com.jyoti;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.Reporter;

public class Problem5 {

	Calculator c1 = new Calculator();

	@Test
	public void testCaseForAddition() {
		int sum = c1.addition(5, 3);
		Reporter.log("addtion of two num is " + sum,true);
		Assert.assertEquals(sum, 8);

	}

	@Test
	public void testCaseForSubstraction() {
		int sub = c1.substraction(5, 3);
		Reporter.log("substration of two num is " + sub,true);
		//Assert.assertEquals(sub, 2);

	}

	@Test
	public void testCaseForMultiplication() {
		int mul = c1.multiplication(5, 3);
		Reporter.log("multiplication of two num is " + mul,true);
		//Assert.assertEquals(mul, 15);

	}

	@Test
	public void testCaseForDivision() {
		int div = c1.division(15, 3);
		Reporter.log("division of two num is " + div,true);
		//Assert.assertEquals(div, 5);

	}
	
	@Test
	public void testCaseModulation() {
		int mod = c1.mod(14, 3);
		Reporter.log("modulation of two num is " + mod,true);
		//Assert.assertEquals(mod, 2);

	}
	
	@Test
	public void testCaseExp() {
		double exp1 = c1.exp(5, 3);
		Reporter.log("exponetial of two num is " + exp1,true);
		//Assert.assertEquals(exp1, 125.0);

	}
	
	@Test
	public void teseCaseForInverse() {
		double div = c1.inverse(2);
		Reporter.log("inverse of  num is " + div,true);
		//Assert.assertEquals(div, 0.5);

	}
	
	@Test
	public void teseCaseForNegate() {
		int div = c1.negate(4);
		Reporter.log("negation of num is " + div,true);
		//Assert.assertEquals(div, -4);

	}

}
