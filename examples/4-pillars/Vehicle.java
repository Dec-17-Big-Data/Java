package com.example.FourPillars;

public class Vehicle implements Pushable {
	public void startEngine() {
		System.out.println("Vroom...");
	}

	@Override
	public void push() {
		// TODO Auto-generated method stub
		System.out.println("roll...");
	}
}
