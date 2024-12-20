package com.balaji.java;

public class SeparationOf0_1 {

	public static void main(String[] args) {
		int arr[]=new int[] {0,0,0,1,1,1};
		int count=0;
		

		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1)
				count++;
		}
		for(int j=0;j<count;j++) {
			arr[j]=1;
		}
		for(int j=count;j<arr.length;j++) {
			arr[j]=0;
		}
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]+" ");
		}

	}

}
