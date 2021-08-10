class Honda4 extends Bike{  
	void run(){
		System.out.println("running safely");	//Implementation is here
	}  
	public static void main(String args[]){  
 		Bike obj = new Honda4();  		//Substantiate from the Abtract class, constructor from the child class
 		obj.run();  				//child method
	}  
} 
  
 