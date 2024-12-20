package com.balaji.java;

public class Car {
	
		private String name;
		private String color;
		private int cost;
		private int topSpeed;
		private String country;
		Car(String a,String b,int c,int d,String e){
			name=a;
			color=b;
			cost=c;
			topSpeed=d;
			country=e;
		}
		
		public String getName() {
			return name;
		}
		
		public String getColor() {
			return color;
		}
		
		public int getCost() {
			return cost;
		}
		
		public int getTopSpeed() {
			return topSpeed;
		}
		
		public String getCountry() {
			return country;
		}
}
