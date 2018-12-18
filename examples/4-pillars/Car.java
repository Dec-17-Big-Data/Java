package com.example.FourPillars;

public class Car extends Vehicle {
	
	final private int milesPerGallon = 7;
	
	public void printGasMileage() {
		System.out.println(milesPerGallon);
	}
	
	@Override
	public void startEngine() {
		System.out.println("(queit) Vroom");
	}

}
