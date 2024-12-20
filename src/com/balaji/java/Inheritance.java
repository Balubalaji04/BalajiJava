package com.balaji.java;
class Parents{
	//inherited
	void eat()
	{
		System.out.println("Parent Eats");
	}
	//overriden
	void sleep()
{
		System.out.println("Parent Sleeps");
		}
	//inherited
	void run() {
		System.out.println("Parent Runs");
	}
}
class Childs extends Parents{
	//overriden
	void sleep() {
		System.out.println("Child Sleeps");
	}
	//Specialized
	void swims() {
		System.out.println("Child Swims");
	}
}
public class Inheritance {

	public static void main(String[] args) {
	Childs c1=new Childs();
	c1.eat();
	c1.sleep();
	c1.run();
	c1.swims();
	}

}
