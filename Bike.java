//Example of an abstract class that has abstract and non-abstract methods  

abstract class Bike{  
	Bike(){						//Constructor
		System.out.println("bike is created");
	}  
   	
	abstract void run();  				//abtract method
   	void changeGear(){				//non-abstract method
		System.out.println("gear changed");
	}  
 }  
