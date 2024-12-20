package com.balaji.java;
class One{
	public void print_hello() {
		System.out.println("Hello");
		
}

	public void print_hello_world(){
		System.out.println("Hello World");
	}
}
class Two extends One{
	public void print_world() {
		System.out.println("world");
	}
}
public class SingleInheritance {

	public static void main(String args[]) {
	
		Two t=new Two();
		t.print_hello();
		t.print_world();
		t.print_hello_world();
	}
	

}
