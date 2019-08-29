package org.abs;

public class AnimalSound {

	public static void main(String[] args) {
    String input = "cat";
    Animal getObj = new AnimalFactory().getAnimalObj(input);
    System.out.println(getObj.sound());  
  
	}

}
