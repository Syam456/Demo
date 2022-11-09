package com.learn.oop.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Employe {
	public static void main(String[] args) {
		ArrayList<String> emplist=new ArrayList<>();
		emplist.add("syam");
		emplist.add("kumar");
		emplist.add("sss");
		emplist.add("kkk");
		emplist.remove(2);
		
Iterator itr=emplist.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
