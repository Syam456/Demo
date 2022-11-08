package com.learn.oop;


public class Dev extends Employe {
	Integer Bonus = 30000;
	Integer Total = Bonus + Basesalery;

	public static void main(String[] args) {
		Dev syam = new Dev();
		System.out.println("Total Salery of Syam is " + syam.Total);
	}

}
