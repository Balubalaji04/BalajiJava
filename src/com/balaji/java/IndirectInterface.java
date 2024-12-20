package com.balaji.java;
import java.util.*;
abstract interface Shape{
	double radius;
	static double pi;
	double length;
	double bredth;
	double l;
	double areaCircle;
	double areaRectangle;
	double areaSquare;
	static{
		pi=3.14;
	}
	abstract void collectData1();
	abstract void calculate1();
	abstract void display1();
	abstract void collectData2();
	abstract void calculate2();
	abstract void display2();
	abstract void collectData3();
	abstract void calculate3();
	abstract void display3();
}
public class IndirectInterface {
	public static void main(String[] args) {
		Shape s=new Shape() {
			@Override
			public void collectData1() {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the radius of circle:");
				radius=sc.nextDouble();
				
				}
			public void calculate1(){
				areaCircle=pi*radius*radius;
			}
			public void display1() {
				System.out.println("Area of Circle:"+areaCircle);
			}
			public void collectData2() {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the length of rectangle:");
				length=sc.nextDouble();
				System.out.println("Enter the bredth of rectangle:");
				bredth=sc.nextDouble();
				
				}
			public void calculate2(){
				areaRectangle=length*bredth;
			}
			public void display2() {
				System.out.println("Area of Rectangle:"+areaRectangle);
			}
			public void collectData3() {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the length of square:");
				l=sc.nextDouble();
				
				}
			public void calculate3(){
				areaSquare=l*l;
			}
			public void display3() {
				System.out.println("Area of Triangle:"+areaSquare);
			}
			
			
			
		};
		s.collectData1();
		s.calculate1();
		s.display1();
		s.collectData2();
		s.calculate2();
		s.display2();
		s.collectData3();
		s.calculate3();
		s.display3();
	}

}
