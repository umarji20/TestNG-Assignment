package com.jyoti;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Program4ParrallelEx2 {
	
	
	
	Calculator c1 = new Calculator();
	
	@Test
	public void testCaseForAddition() {
		int a = c1.addition(2, 3);
		Assert.assertEquals(a, 5);
		System.out.println("The testCaseForAddition method in " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());

	}

	@Test
	public void testCaseForSubstraction() {
		int a = c1.substraction(5, 3);
		Assert.assertEquals(a, 2);
		System.out.println("The testCaseForSubstraction method in " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());

	}

	@Test
	public void testCaseForMultiplication() {
		int a = c1.multiplication(4, 3);
		Assert.assertEquals(a, 12);
		System.out.println("The testCaseForMultiplication method in " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());

	}

}
