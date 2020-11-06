package com.xworkz.java_program.inheritence.multilevel;

public class MultilevelInheritence {
	public static void main(String[] args){
		
		Vehicle v=new Vehicle();
		Maruthi m=new Maruthi();
		Maruthi800 c=new Maruthi800();
		
		System.out.println("Properties of vehicle....");
		v.milage();
		v.speed();
		System.out.println();
		
		System.out.println("Properties of maruthi....");
		m.color();
		m.milage();
		m.speed();
		m.milage();
		m.numberofcylinder();
		System.out.println();
		
		System.out.println("Properties of maruthi800.....");
		c.color();
		c.fueltankcapacity();
		c.milage();
		c.numberofcylinder();
		c.seatingCapacity();
		c.speed();
		
	}
}
