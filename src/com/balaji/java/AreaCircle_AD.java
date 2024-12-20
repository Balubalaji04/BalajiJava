package com.balaji.java;
import java.util.*;
abstract class Sheets{
	abstract void collectData();
	abstract void calculate();
	abstract void display();
}
class AreaCircle1 extends Sheets{
	double radius;
	static double pi;
	static{
		pi=3.14;
	}
	double areaCircle;
	
	@Override
	void collectData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of circle:");
		radius=sc.nextDouble();
		
		}
	void calculate(){
		areaCircle=pi*radius*radius;
	}
	void display() {
		System.out.println("Area of Circle:"+areaCircle);
	}
	
}
class AreaRectangle extends Sheets{
	double length;
	double bredth;
	double areaRectangle;
	@Override
	void collectData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of rectangle:");
		length=sc.nextDouble();
		System.out.println("Enter the bredth of rectangle:");
		bredth=sc.nextDouble();
		
		}
	void calculate(){
		areaRectangle=length*bredth;
	}
	void display() {
		System.out.println("Area of Rectangle:"+areaRectangle);
	}
	
}
class AreaTriangle extends Sheets{
	double base;
	double height;
	double areaTriangle;
	@Override
	void collectData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base of triangle:");
		base=sc.nextDouble();
		System.out.println("Enter the height of triangle:");
		height=sc.nextDouble();
		
		}
	void calculate(){
		areaTriangle=0.5*(base*height);
	}
	void display() {
		System.out.println("Area of Triangle:"+areaTriangle);
	}
	
}
public class AreaCircle_AD {

	public static void main(String[] args) {
		AreaCircle1 ac=new AreaCircle1();
		ac.collectData();
		ac.calculate();
		ac.display();
		AreaRectangle ar=new  AreaRectangle();
		ar.collectData();
		ar.calculate();
		ar.display();
		AreaTriangle at=new AreaTriangle();
		at.collectData();
		at.calculate();
		at.display();
		
		
		
		
	}

}
