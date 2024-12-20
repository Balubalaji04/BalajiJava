package com.balaji.java;

public class Human {
	private String name;
	private String location;
	private int age;
	private double height;
	private double weight;
	Human(String a,String b,int c, double d,double e){
		this("Ramu","Bangalore",21,176.9);
		name=a;
		location=b;
		age=c;
		height=d;
		weight=e;
	}
	Human(String a,String b,int c, double d){
		this("Vamsi","Hyderabad",26);
		name=a;
		location=b;
		age=c;
		height=d;
		
	}
	Human(String a,String b,int c){
		name=a;
		location=b;
		age=c;
		
	}

	public String getName() {
		return name;
	}
	
	public String getLocation() {
		return location;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWeight() {
		return weight;
	}
	
}
