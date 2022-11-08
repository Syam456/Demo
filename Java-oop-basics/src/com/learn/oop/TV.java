package com.learn.oop;

public class TV {
	String Brand;
	String Modelname;
	Integer Screensize;
	Integer Price;
	String Colour;
	String Displaytype;
	
	void insertData(String B, String Mn, Integer Ss, Integer P, String C, String Dt) {
		Brand=B;
		 Modelname=Mn;
		 Screensize=Ss;
		 Price=P;
		 Colour=C;
		 Displaytype=Dt;
		 
		}
	void displayTv() {
		System.out.println(Brand+" "+ Modelname);
	}
	
	public static void main(String[] args) {
		
		TV lg=new TV();
		TV samsung=new TV();
		
		lg.Brand="LG";
		lg.Modelname="4k led TV";
		lg.Screensize=75;
		lg.Price=100000;
		lg.Colour="Black";
		lg.Displaytype="LED";
		
		samsung.insertData("Samsung", "6k led", 50, 120000, "blue","Led");
		
		System.out.println(lg.Brand+" "+lg.Price +" "+lg.Colour);
		
		System.out.println(samsung.Brand+" "+samsung.Price +" "+samsung.Colour);
		
		lg.displayTv();
		samsung.displayTv();
		
			
	}

}
