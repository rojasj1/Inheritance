package com.collabera.jump.design_patterns;

public class WorkWithAnimals {
	public static void main(String[]args) {
		
		Dog fido = new Dog();
		
		fido.setName("Fido");
		System.out.println(fido.getName("Fido"));
		
		fido.digHole();
		fido.setWeight(-1);
		
		int randNum = 10;
		
		fido.changeVar(randNum);
		
		System.out.println("randNum after method call: "+randNum );
		changeObjectName(fido);	
		
		System.out.println("Change Object Name after method call: "+fido.getName("Marcus"));
	}
	public static void changeObjectName(Dog fido) {
		fido.setName("Marcus");
	}
	
}
