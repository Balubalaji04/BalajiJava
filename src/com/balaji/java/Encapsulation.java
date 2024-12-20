package com.balaji.java;

public class Encapsulation {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.setName("Puppy");
		d.setColor("Red");
		d.setCost(12000);
		d.setAge(5);
		d.setBreed("Shitzu");
		System.out.println("Name: "+d.getName());
		System.out.println("Color: "+d.getcolor());
		System.out.println("Cost: "+d.getCost());
		System.out.println("Age: "+d.getAge());
		System.out.println("Breed: "+d.getBreed());



		


	}

}
