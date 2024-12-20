package com.balaji.java;
import java.util.Scanner;
public class Day2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.of Organizations:");
		int m=sc.nextInt();
		System.out.println("enter the no.of Companies:");
		int n=sc.nextInt();
		String a[][][]=new String[m][n][];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
			System.out.println("Enter the no. of employees in Organization no: "+(i+1)+"Company no: "+(j+1));
			a[i][j]=new String[sc.nextInt()];
		}
		}
		for(int i=0;i<a.length;i++) {
			
				System.out.println("Inside Organization no: "+(i+1));
				for(int j=0;j<a[i].length;j++) 
				{
					System.out.println("Inside Company no: "+(j+1));
					for(int k=0;k<a[i][j].length;k++) {
						System.out.println("Enter the name of employee no: "+(k+1));
					
				a[i][j][k]=sc.next();
					}
				}
				}
			
			
		
		for(int i=0;i<a.length;i++)
		{ 
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[j].length;k++) {
				
				
				System.out.println("the name of employee no "+(k+1)+" from company no: "+(j+1)+" in Organization no: "+(i+1)+" is: "+a[i][j][k]);
				}
			}
		}


	}

}
