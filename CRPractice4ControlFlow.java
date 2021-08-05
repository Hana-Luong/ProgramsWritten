import java.util.Scanner; 

public class CRPractice4ControlFlow{
	public static void main(String[] args){

		System.out.println("Please enter number 1 or 2"); 
		Scanner scnr = new Scanner(System.in); 
		String input = scnr.nextLine(); 
		int i = Integer.parseInt(input);


		switch (i){
		case 1:
			System.out.println("You have chosen Addition");
			Addition();

			
			break;	
		case 2: 
			System.out.println("You have chosen Subtraction.");
			Subtraction();
			
			break;

		default:
			System.out.println("Invalid Entry.");
			break;
		}
		scnr.close();
	}
		
	public static void Addition(){
		System.out.println("Pls enter two numbers, each on one line: "); 
		Scanner scnr = new Scanner(System.in); 
		String inAdd1 = scnr.nextLine(); 
		int a = Integer.parseInt(inAdd1);
		String inAdd2 = scnr.nextLine();
		int b = Integer.parseInt(inAdd2);
		System.out.println("The sum of " + a + " and " + b + " is " + (a+b));
	}
	public static void Subtraction(){
		System.out.println("Pls enter two numbers, each on one line: "); 
		Scanner scnr = new Scanner(System.in); 
		String inSub1 = scnr.nextLine(); 
		int c = Integer.parseInt(inSub1);
		String inSub2 = scnr.nextLine();
		int d = Integer.parseInt(inSub2);
		System.out.println("The difference between " + c + " and " + d + " is " + (c-d));
	}

}