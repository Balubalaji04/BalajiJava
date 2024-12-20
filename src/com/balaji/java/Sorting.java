package com.balaji.java;
import java.util.*;
public class Sorting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter the integer numbers :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		boolean isSorting=false;
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]<arr[i+1]){
				isSorting=true;
				
			}
			else {
				isSorting=false;
			}
		}
		if(isSorting) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		

	}

}
