package org.abs;

public class AnimalFactory {
	
	public Animal getAnimalObj(String name) {
		
		Animal animalObj = null;
		
		if(name.equalsIgnoreCase("cow")) {
			animalObj = new Cow();
		}
		else if(name.equalsIgnoreCase("pig")) {
			animalObj = new Pig();
		}else if(name.equalsIgnoreCase("cat")) {
			animalObj = new Cat();
		}		
		else {
			System.out.println("Bad Input nothing to do :(");
		}
		return animalObj;
	}
	
	public Animal getCowObj() {
		
		Cow cowobj = new Cow();
		return cowobj;
	}

}
