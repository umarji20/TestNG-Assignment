package com.jyoti;

public class Calculator {
	
	public int addition(int a,int b) {
		int c=a+b;
		return c;
	}
	
	public int substraction(int a,int b) {
		int c=a-b;
		return c;
	}
	
	public int multiplication(int a,int b) {
		int c=a*b;
		return c;
	}
	
	public int division(int a,int b) {
		int c=a/b;
		return c;
	}
	
	 // Exponent
	   public  double exp(double number1, double number2) {
	      if (number2 == 0) {
	         throw new IllegalArgumentException("Cannot divide by 0!");
	      }
	      return Math.pow(number1, number2);
	   }
	   
	   
	   // Modulus
	   public  int mod(int number1, int number2) {
	      if (number2 == 0) {
	         throw new IllegalArgumentException("Cannot divide by 0!");
	      }
	      return number1%number2;
	   }
	       
	     
	   // Inverse
	   public  double inverse(int number1) {
	      if (number1 == 0) {
	         throw new IllegalArgumentException("Cannot divide by 0!");
	      }
	      return (double) 1 / number1;
	   }
	         
	   
	   // Negate
	   public  int negate(int number1) {
	      if (number1 == 0) {
	         throw new IllegalArgumentException("Cannot divide by 0!");
	      }
	      return (-1) * number1;
	   }   

}
