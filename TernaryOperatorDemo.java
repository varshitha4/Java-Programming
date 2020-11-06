package com.xworkz.java_program.ternary_operator;

public class TernaryOperatorDemo {
	public static void main(String[] args){
	int a=10;
	int b=20;
	int c=30;
	int result=(a>b)?(a>c?a:c):(b>c?b:c);
	System.out.println(result);

}
}