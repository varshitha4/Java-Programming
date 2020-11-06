package com.xworkz.java_program.casting.primitive.implicit;

public class ImplictTypeCasting {
	public static void main(String[] args){
		//implicit type casting
		
		int a=10;
		long b=a;
		
		System.out.println("a:"+ a);
		System.out.println("b:"+ b);
		
		//explicit type casting
		
		long x=10000000;
		int y=(int)x;
		System.out.println("x:"+x);
		System.out.println("y:"+y);
	}

}
