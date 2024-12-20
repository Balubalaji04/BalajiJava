package com.balaji.java;
import java.util.Scanner;
public class Farmer {
double principle;
static double rate;
double time;
double simpleInterest;
static {
	rate=2.5;
}
void CollectData() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the principle amount:");
	principle=sc.nextDouble();
	System.out.println("Enter the time in years:");
	time=sc.nextDouble();
	}
void Calculate() {
	simpleInterest=(principle*time*rate)/100;
	
}
void Display() {
	System.out.println("The Simple Interest is : "+simpleInterest);
}

}
