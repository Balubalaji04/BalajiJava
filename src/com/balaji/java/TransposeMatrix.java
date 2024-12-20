package com.balaji.java;
import java.util.*;
public class TransposeMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
					arr[i][j]=sc.nextInt();
				}
		}
		System.out.println("The matrix of array: ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
					System.out.print(arr[i][j]+" ");
				}
			System.out.println();
		}
		int temp[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				temp[i][j]=arr[j][i];
				
			}
		}
		System.out.println("Transpose matrix of array: ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(temp[i][j]+" ");
				
			}
			System.out.println();
		}
		
	}

}
