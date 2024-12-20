package com.balaji.java;

public class CountOfWords {

	public static void main(String[] args) {
		String words="Hello World Good Morning";
		int count=0;
		for(int i=0;i<words.length();i++) {
			if(words.charAt(i)==' ')
				count++;
		}
		System.out.println("The Number of Words: "+(count+1));

	}

}
