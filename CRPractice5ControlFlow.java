import java.util.Scanner; 

public class CRPractice5ControlFlow{
	public static void main(String[] args){

		System.out.println("Please enter number 1 or 2"); 
		Scanner scnr = new Scanner(System.in); 		
		int i = scnr.nextInt();

		while( i != 1 || i != 2){		

			boolean done = false;
			switch (i){
			case 1:
				System.out.println("You have chosen Addition");
				Addition(scnr);	
				done = true;		
				break;	
			case 2: 
				System.out.println("You have chosen Subtraction.");
				Subtraction(scnr);
				done = true;			
				break;

			default:
				System.out.println("Invalid Entry.");
				System.out.println("Please enter No 1 or 2: "); 
				System.out.println("Please enter number 1 or 2"); 
				scnr = new Scanner(System.in); 		
				i = scnr.nextInt();
				break;
			}
			if (done)
				break;
		}
		scnr.close();
	}
		
	public static void Addition(Scanner scnr){
		System.out.println("Pls enter two numbers, each on one line: "); 
		int a = scnr.nextInt();
		int b = scnr.nextInt();
		System.out.println("The sum of " + a + " and " + b + " is " + (a+b));
	}
	public static void Subtraction(Scanner scnr){
		System.out.println("Pls enter two numbers, each on one line: "); 
		int c = scnr.nextInt();
		int d = scnr.nextInt();
		System.out.println("The difference between " + c + " and " + d + " is " + (c-d));
	}

}