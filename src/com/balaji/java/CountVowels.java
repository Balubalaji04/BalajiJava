package com.balaji.java;
import java.util.*;
public class CountVowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String: ");
		String word=sc.nextLine();
		word.toLowerCase();
		int count=0;
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)=='a'||word.charAt(i)== 'e' ||word.charAt(i)== 'i' ||word.charAt(i)== 'o' ||word.charAt(i)=='u' )
				count++;
			}
		System.out.println("The number Vowels in "+word+" : "+count);
		}
	}
