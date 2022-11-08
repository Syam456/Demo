package com.learn.oop.exception;

public class TestingFinallyBlock {
	public static void main(String[] args) {
		try {
			System.out.println("inside the try block");
			int num=20/0;
			System.out.println(num);
		}catch(NullPointerException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("this bit is excuted regadless of the Exception occuring or not");
		}
		System.out.println("continue");
	}

}
