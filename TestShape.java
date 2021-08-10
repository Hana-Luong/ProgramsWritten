//In real scenario, method is called by programmer or user  

class TestShape{  
	public static void main(String[] args){  
		Shape s=new Circle();
		//In a real scenario, object is provided through method, e.g., getShape() method  
		s.draw();  

		Shape s1 = new Rectangle();
		s1.draw();
	}
} 
 
