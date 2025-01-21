package oops_concepts;

public class Factory {
	
	//Runner class by referring Cars class
	public Factory() {
		// TODO Auto-generated constructor stub
	}
	
	//cars can be created based on model class car. Concept is in the car class

	public static void main(String[] args) {
		//will have to provide engineCapacity as soon as create a car. No car created without engineCapacity
		Cars audi = new Cars(3000); // creating the car with the data value 1200 in parameter of constructor
		audi.color = "white";
		audi.make = "Audi";
		audi.model = "A8";
		audi.seatingCapacity = 7;
		audi.numberOfAirBags = 6;		
		audi.startIgnition();
		audi.accelerate();
		audi.applyBrakes();
		audi.getEngineCapacity();
		audi.getCarColor();
		
		
		Cars maruti800 = new Cars(800);
		maruti800.color = "red";
		maruti800.make = "Suzuki";
		maruti800.model = "800";
		maruti800.seatingCapacity = 4;
		maruti800.startIgnition();
		maruti800.accelerate();
		maruti800.applyBrakes();
		maruti800.getEngineCapacity();
		maruti800.getCarColor();
		
		
		Cars benz = new Cars(2000);
		benz.make = "Benz";
		benz.model = "GLC";
		benz.getEngineCapacity();		
		
		
		Cars bmw = new Cars(0);
		bmw.make = "BMW";
		bmw.model = "E Series";
		bmw.getEngineCapacity();
		
	}

}
