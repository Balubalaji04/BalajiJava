package com.balaji.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Student implements Comparable<Student>{
	private int sid;
	private String sname;
	private String sclg;
	public Student() {
		
	}
	public Student(int id,String name,String clg) {
		this.sid=id;
		this.sname=name;
		this.sclg=clg;
	}
	public void setId(int id) {
		this.sid=id;
	}
	public void setName(String name) {
		this.sname=name;
	}
	public void setClg(String clg) {
		this.sclg=clg;
	}
	public int getId() {
		return this.sid;
	}
	public String getName() {
		return this.sname;
	}
	public String getClg() {
		return this.sclg;
	}
	@Override
	public String toString() {
		return sid +" " + sname +" "+sclg;
	}
	
	@Override
	public int compareTo(Student s2) {
		Student s1=this;
		int res=s1.sname.compareTo(s2.sname);
		return res;
	}
}
public class Comparator {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No.of Students");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			Student s=new Student();
			System.out.println("Enter the Student Id");
			s.setId(sc.nextInt());
			System.out.println("Enter the Student Name");
			sc.nextLine();
			s.setName(sc.nextLine());
			System.out.println("Enter the Student CollegeName");
			s.setClg(sc.nextLine());
			
			al.add(s);
		}
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}

}
