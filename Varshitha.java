package com.xworkz.java_program.method;

public class Varshitha{
	public static void main(String[] args){
		FruitShop fruitshop= new FruitShop();
		System.out.println("varshitha going to fruitshop to get fruits");
		Fruit fruit= fruitshop.giveFruit("orange",1);
		System.out.println("varshitha got the fruits");
		fruit.get();
		
		
		
	}
}
