package com.learn.oop;

public class Sales {
   Integer Bonus=10000;
   Integer Insentive;
   void Working() {
	   System.out.println("Employe is a part of sales team and they are working");
   }
   
   public static void main(String[] args) {
	Sales naga=new Sales();
	naga.Insentive=2000;
	//naga.Totalsalery
	naga.Working();
}
}
