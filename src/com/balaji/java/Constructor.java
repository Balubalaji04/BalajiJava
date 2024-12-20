package com.balaji.java;

public class Constructor {

	public static void main(String[] args) {
		Car c=new Car("Tata","Red",5000000,120,"Japan");
		System.out.println("Name: "+c.getName());
		System.out.println("Color: "+c.getColor());
		System.out.println("Cost: "+c.getCost());
		System.out.println("TopSpeed: "+c.getTopSpeed());
		System.out.println("Country: "+c.getCountry());
	}

}
