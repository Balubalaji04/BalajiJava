package com.balaji.java;
class One1{
	public void eat() {
		System.out.println("One Eats");
	}
}
class Two1 extends One1{
	public void sleep() {
		System.out.println("Two sleeps");
	}
}
class Three extends Two1{
	public void run() {
		System.out.println("Three runs");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		Three t=new Three();
		t.eat();
		t.sleep();
		t.run();

	}

}
