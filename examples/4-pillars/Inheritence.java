package com.example.FourPillars;

/*
 	This is a multi-line comment
 */

/**
 * 
 * @author qiunn
 *
 */
public class Inheritence {
	public static void main(String[] args) {
		
		Vehicle v = new Vehicle();
		Car c = new Car();
		
		v.startEngine();
		c.startEngine();
		
		c.printGasMileage();
		// v.printGarMileage(); (Does not get classes methods that extend from it)
		
		
		Vehicle v2 = new Car();
		
		Pushable[] vArray = {
				new Truck(),
				new Car(),
				new Vehicle()
		};
		
		for(int i = 0; i < vArray.length; ++i) {
			if (vArray[i] instanceof Car) {
				((Car) vArray[i]).printGasMileage();
			}
			
			((Vehicle) vArray[i]).startEngine();
		}
	}
}
