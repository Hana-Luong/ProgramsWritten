import java.util.*;

public class Vector2{

	public static void main(String[] args){
		//Create a new vector with initial capacity 4
		Vector<String> vec = new Vector<String>(4);

		//add();
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		

		//Check size and capacity
		System.out.println("Size is :" + vec.size());
		System.out.println("Default capacity is: " + vec.capacity());
		System.out.println("Elements are: " + vec);

		//addElement();
		vec.addElement("Elephant");
		vec.addElement("Rat");
		vec.addElement("Cat");
		
		
		//Check new size and capacity
		System.out.println("New size is :" + vec.size());
		System.out.println("New capacity is: " + vec.capacity());
		System.out.println("Elements are: " + vec);

		if(vec.contains("Tiger"))
			System.out.println("Tiger is present at the index " + vec.indexOf("Tiger"));
		else
			System.out.println("Tiger is not present in the list.");
		//Get the first element
		System.out.println("The first animal of the vector is: " + vec.firstElement());
		System.out.println("The last animal of the vector is: " + vec.lastElement());
	}
}