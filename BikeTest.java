//Creating a Test class which calls abstract and non-abstract methods 
 
class BikeTest{  
	public static void main(String args[]){  
		Bike obj = new Honda();  
		obj.run();  
		obj.changeGear();  
	}  
}  