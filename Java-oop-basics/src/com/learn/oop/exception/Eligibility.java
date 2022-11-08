package com.learn.oop.exception;

public class Eligibility {
	
	public static void Eligible(Integer Exp) {
		if(Exp <10 ) {
			throw new ArithmeticException("This person is not eligible to be senior");
		}else {
			System.out.println("this person is eligible");
			
		}
	}
	public static void main(String[] args) {
		Eligible(9);
	}

}
