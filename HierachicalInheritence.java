package com.xworkz.java_program.inheritence.hierarchical;

public class HierachicalInheritence {
	public static void main(String[] args){
		Mango mango=new Mango();
		mango.growth();
		mango.taste();
		mango.color();
		System.out.println();
		
		Orange orange=new Orange();
		orange.shape();
		orange.color();
		orange.shape();
		System.out.println();
		
		Apple apple=new Apple();
		apple.taste();
		apple.color();
		apple.taste();
		System.out.println();
	}

}
