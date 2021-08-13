import java.util.*;

public class Vector1{

	public static void main(String[] args){
		//Create a new vector
		Vector<String> vec = new Vector<String>();

		//add();
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("Elephant");

		//addElement();
		vec.addElement("Rat");
		vec.addElement("Cat");
		vec.addElement("Dear");

		System.out.println("Elements are: " + vec);
	}
}