package com.learn.oop.collection;

import java.util.HashSet;
import java.util.Iterator;

public class Employe2 {
public static void main(String[] args) {
	HashSet<String> emp2=new HashSet<>();
	
	emp2.add("HR");
	emp2.add("Customer");
	emp2.add("Team");
	emp2.add("Member");
	
	emp2.remove("Member");
	
	Iterator<String> its=emp2.iterator();
	while(its.hasNext()) {
		System.out.println(its.next());
	}
}
}
