package com.learn.oop.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraayListDemo {
	public static void main(String[] args) {
		ArrayList<String> ParticipentsList=new ArrayList<>();
		ParticipentsList.add("Syam");
		ParticipentsList.add("Sai");
		ParticipentsList.add("naga");
		ParticipentsList.add("basha");
		ParticipentsList.add("Sandeep");
		ParticipentsList.add("Anji");
		
		//System.out.println(ParticipentsList);
		Iterator itr=ParticipentsList.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
