package com.learn.oop;

public class Employe {
	Integer Basesalery = 50000;
	void Totalsalery(Integer BS,Integer Bonus) {
		Integer total=BS+Bonus;
		System.out.println(total);
	}
	
	void Totalsalery(Integer BS,Integer Bonus,Integer Insentive) {
		Integer total=BS+Bonus+Insentive;
		System.out.println(total);
	}
	void Working() {
		System.out.println("Employe is working");
	}
}
