package com.learn.oop.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Employe1 {
public static void main(String[] args) {
	LinkedList<String> emp1= new LinkedList<String>();
	emp1.add("syam");
	emp1.add("sai");
	emp1.add("naga");
	emp1.add("sandeep");
	
	emp1.remove("naga");
	
	Iterator<String> itr=emp1.iterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
