package com.learn.oop;

public class HR extends Employe{
	Integer Bonus = 40000;
	Integer Total = Bonus + Basesalery;
	
	public static void main(String[] args) {
		HR sai=new HR();
		System.out.println("Sai total Salery is"+ sai.Total);
	}

}
