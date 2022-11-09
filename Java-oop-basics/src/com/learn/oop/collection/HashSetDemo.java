package com.learn.oop.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> members=new HashSet<String>();
		
		members.add("syam");
		members.add("kumar");
		members.add("sai");
		members.add("sss");
		
		members.remove("sss");
		
		Iterator<String> its=members.iterator();
		while(its.hasNext()) {
			System.out.println(its.next());
		}
	}

}
