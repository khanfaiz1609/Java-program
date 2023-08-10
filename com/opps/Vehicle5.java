package com.opps;

public abstract class Vehicle5 {
	int a;
	abstract void start();
}
class Car extends Vehicle5{
	void start() {
		System.out.println("Starts with key");
	}
}
class Scooter extends Vehicle5{
	void start() {
		System.out.println("Starts with key1");
	}
	public static void main(String[] args) {
		Scooter s=new Scooter();
		Car s1=new Car();
		s1.start();
		s.start();
	}
}
