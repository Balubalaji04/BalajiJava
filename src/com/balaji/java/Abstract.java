package com.balaji.java;
abstract class Plane{
	public void takeOff() {
		System.out.println("Plane TakeOff");
	}
	abstract void fly();
	public void land() {
		System.out.println("Plane Landed");
	}
}
class CargoPlane extends Plane{
@Override
void fly(){
	System.out.println("CargoPlane Flys");
}
	
}
public class Abstract {

	public static void main(String[] args) {
		CargoPlane c=new CargoPlane();
		c.takeOff();
		c.fly();
		c.land();
		//Indirect method
		Plane ref=new Plane() {
			@Override
			void fly() {
				System.out.println("Plane Flew");
			}
		};
		ref.fly();

	}

}
