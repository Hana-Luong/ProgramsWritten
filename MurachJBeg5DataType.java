public class MurachJBeg5DataType{
	public static void main(String[] args){
		System.out.println("PracticeApplication");

		int quantity = 3;
		double price = -24.95;
		float floatNumber = 24.95e+15F; 
		char character = 75;
		boolean valid = true;
		System.out.println("Quantity = " + quantity);
		System.out.println("Price = " + price);
		System.out.println("FP Number = " + floatNumber);
		System.out.println("Char = " + character);
		System.out.println("Valid = " + valid);

		double doubleResult = 0.0;
		doubleResult = quantity * price;
		System.out.println("Double Result= " +doubleResult); 

		int integerResult = 0;
		integerResult = (int) doubleResult; //cast a double to an integer, floor if positive
		System.out.println("Integer Result = " + integerResult);

		doubleResult = doubleResult + 1;
		integerResult++;
		character++;
		
		System.out.println("Double Result = " + doubleResult);
		System.out.println("Integer Result = " + integerResult);
		System.out.println("Character = " + character);

		double orderTotal = 1000.0;
		double invoiceTotal = 0.0;
		final double SALES_TAX_PERCENT = .0785;
		System.out.println("\n\n" + "Order Total = " + orderTotal + "\n" 
			+ "Invoice Total = " + invoiceTotal + "\n");

		String stringNumber = "3.146";
		double parsedDouble = Double.parseDouble(stringNumber); 
		// Double IN CAPITAL
		String message = "\n\n" + "String number = " + stringNumber + "\n"
			+ "Parsed Number = " + parsedDouble + "\n";	
		System.out.println(message);

		System.exit(0);
		
	}
	
}

/*Price = 24.95
FP Number = 2.49499997E16*/