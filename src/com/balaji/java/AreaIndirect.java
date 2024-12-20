package com.balaji.java;
import java.util.*;
abstract class Sheets1{
	double radius;
	static double pi;
	double length;
	double bredth;
	double base;
	double height;
	double areaCircle;
	double areaRectangle;
	double areaTriangle;
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
public class AreaIndirect {

	public static void main(String[] args) {
		Sheets1 s=new Sheets1() {
			@Override
			void collectData1() {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the radius of circle:");
				radius=sc.nextDouble();
				
				}
			void calculate1(){
				areaCircle=pi*radius*radius;
			}
			void display1() {
				System.out.println("Area of Circle:"+areaCircle);
			}
			void collectData2() {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the length of rectangle:");
				length=sc.nextDouble();
				System.out.println("Enter the bredth of rectangle:");
				bredth=sc.nextDouble();
				
				}
			void calculate2(){
				areaRectangle=length*bredth;
			}
			void display2() {
				System.out.println("Area of Rectangle:"+areaRectangle);
			}
			void collectData3() {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the base of triangle:");
				base=sc.nextDouble();
				System.out.println("Enter the height of triangle:");
				height=sc.nextDouble();
				
				}
			void calculate3(){
				areaTriangle=0.5*(base*height);
			}
			void display3() {
				System.out.println("Area of Triangle:"+areaTriangle);
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
