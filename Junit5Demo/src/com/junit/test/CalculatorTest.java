package com.junit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.junit.demo.Calculator;

public class CalculatorTest {
	@Test
	@DisplayName("Adding two possitive numbers")
	public void testAddMethod() {
		
		Calculator calc=new Calculator();
		
		int sum=calc.add(10, 100);
		assertEquals(110, sum);
		System.out.println("total sum is:"+ sum);
	}

	@Test
	@DisplayName("Subtratcing two possitive numbers")
	public void testSubMethod() {
		
		Calculator calc=new Calculator();
		
		int total=calc.sum(10, 100);
		assertEquals(-90, total);
		System.out.println("total sum is:"+ total);
	}

	@Test
	@DisplayName("Multiplying two possitive numbers")
	public void testProductMethod() {
		
		Calculator calc=new Calculator();
		
		int sum=calc.product(5, 100);
		assertEquals(500,sum);
		System.out.println("total sum is:"+ sum);
	}

}
