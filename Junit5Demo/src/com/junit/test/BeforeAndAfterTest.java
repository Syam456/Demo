package com.junit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.junit.demo.Calculator;

public class BeforeAndAfterTest {
	Calculator calc;
	@BeforeEach
	public void init() {
		calc=new Calculator();
		System.out.println("The Before each method iscalled right now");
	}
	@AfterEach
	public void  after() {
		System.out.println("After Each test Case");
	}
	
//	@BeforeAll
//	public void BeforeAll() {
//		System.out.println("Before All");
//		
//	}
	
	@Test
	@DisplayName("Adding two possitive numbers")
	public void testAddMethod() {
		
		
		
		int sum=calc.add(10, 100);
		assertEquals(110, sum);
		System.out.println("total sum is:"+ sum);
	}

	@Test
	@DisplayName("Subtratcing two possitive numbers")
	public void testSubMethod() {
		
		int total=calc.sum(10, 100);
		assertEquals(-90, total);
		System.out.println("total sum is:"+ total);
	}

	@Test
	@DisplayName("Multiplying two possitive numbers")
	public void testProductMethod() {
		
		int sum=calc.product(5, 100);
		assertEquals(500,sum);
		System.out.println("total sum is:"+ sum);
	}


}
