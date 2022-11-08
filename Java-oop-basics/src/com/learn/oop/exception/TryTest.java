package com.learn.oop.exception;

public class TryTest {
public static void main(String[] args) {
	try {
		Integer number=50/0;
	}catch(ArithmeticException e) {
		
	}
	System.out.println("continue");
}
}
