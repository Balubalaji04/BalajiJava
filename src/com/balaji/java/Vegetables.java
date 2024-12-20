package com.balaji.java;

public class Vegetables {
	private String name;
	private String color;
	private int cost;
	private int size;
	//constructor
	Vegetables(String name,String color,int cost,int size){
		this.name=name;
		this.color=color;
		this.cost=cost;
		this.size=size;
	}
	//add gettters

	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getCost() {
		return cost;
	}
	
	public int getSize() {
		return size;
	
	}
}
