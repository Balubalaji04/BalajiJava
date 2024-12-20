package com.balaji.java;
import java.util.Scanner;
public class Circle {
double radius;
static double pi;
double areaCircle;
static{
	pi=3.14;
}
void CollectData() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the radius of circle:");
	radius=sc.nextDouble();
	
	}
void Calculate() {
	areaCircle=pi*radius*radius;
}
void Display() {
	System.out.println("The Area Of Circle:"+areaCircle);
}
}
