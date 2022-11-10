package com.junit.test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestDemo {
	
	
	//valueSource................
	
	@ParameterizedTest(name="{index}-run with the args= {0}")
	@ValueSource(ints= {1,5,3,7})
	public void  valueSourceTest(int args) {
		System.out.println(args);
	}
	
	//EnumSource.................
	
	enum TV{
		LG,Samsung,Thoshiba;
	}
	@ParameterizedTest
	@EnumSource(TV.class)
	public void enumSourceTest(TV tv) {
		System.out.println(tv);
	}
	
	//MethodSource.................
	
	private static String[] cars() {
		return new String[] {"maruthi","shift","honda"};
		
	}
	@ParameterizedTest
	@MethodSource("cars")
	public void methodSourceTest(String cars) {
		System.out.println(cars);
	}
	
	
	//csvSource.............
	
	@ParameterizedTest
	@CsvSource({"syam","kumar","Sss","kkk"})
	public void csvSourceTest(String name) {
		System.out.println(name);
		
	}
	
	//
	
	
	}


