package com.balaji.java;
import java.util.Scanner;
public class Swapping {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[4];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j]+" ");
		}

	}

}
