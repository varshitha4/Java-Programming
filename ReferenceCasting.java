package com.xworkz.java_program.casting.reference.upanddown;

public class ReferenceCasting {
	public static void main(String[] args){
		
		//up casting
		
		Veg veg=new Carrot();
		veg.wash();
		veg.chop();
		
		//down casting
		
		Veg veg1=new Carrot();
		Carrot carrot=(Carrot)veg1;
		carrot.halwa();
	
	}

}
