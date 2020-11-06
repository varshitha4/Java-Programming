package com.xworkz.java_program.inheritence;

public class MachineAndComputer {
	public static void main(String[] args){
		Machine m = new Machine();
		Computer c = new Computer();
		
		System.out.println("properties of machine....");
		m.generation();
		m.storage();
		m.speed();
		System.out.println();
		
		System.out.println("properties of computer");
		c.graphics();
		c.operatingsystem();
		c.generation();
		c.speed();
		c.storage();
	}

}
