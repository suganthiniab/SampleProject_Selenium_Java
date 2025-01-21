package oops_concepts;

public class Cars {

	public String make;
	public String model;
	public String color;
	public int engineCapacity;
	public int seatingCapacity;
	public int numberOfAirBags;

	public Cars(int engineCapacity) {
		if (engineCapacity <= 600) {
			System.out.println("Please enter valid engine capacity");
		}

		this.engineCapacity = engineCapacity;
	}

	public void accelerate() {
		System.out.println(make + " " + model + " Car is accelerating");
	}

	public void applyBrakes() {
		System.out.println(make + " " + model + " Car is applying brakes");
	}

	public void startIgnition() {
		System.out.println(make + " " + model + " Car Ignition started");
	}

	public void getEngineCapacity() {
		System.out.println("Engine capacity of " + make + " " + model + " is" + " " + engineCapacity);
	}

	public void getCarColor() {
		System.out.println("Color of " + make + " " + model + " is" + " " + color);
	}

}
