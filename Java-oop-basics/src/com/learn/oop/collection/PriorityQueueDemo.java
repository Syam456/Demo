package com.learn.oop.collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<String> CustomerQueue=new PriorityQueue<>();
		
		CustomerQueue.add("syam");
		CustomerQueue.add("kumar");
		CustomerQueue.add("sss");
		CustomerQueue.add("ddd");
		
		System.out.println("Lead is: "+CustomerQueue.peek());
		Iterator<String> its=CustomerQueue.iterator();
		while(its.hasNext()) {
			System.out.println(its.next());
		}
	}

}
