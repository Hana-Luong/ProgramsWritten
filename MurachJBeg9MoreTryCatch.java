import javax.swing.JOptionPane;
import java.text.*;

public class MurachJBeg9MoreTryCatch{
	public static void main(String[] args){
		String choice = "";
		while(!(choice.equalsIgnoreCase("x"))){
			String inputString = JOptionPane.showInputDialog("Enter order total: ");
			double orderTotal = 0;
			boolean tryAgain = true;
			while(tryAgain){
				try{
					orderTotal = Double.parseDouble(inputString);
					while(orderTotal <= 0){
						inputString = JOptionPane.showInputDialog(
							"Invalid order total.\n"
							+ "Please enter a positive number: ");
						orderTotal = Double.parseDouble(inputString);
					} 
				tryAgain = false;
				}
				catch(NumberFormatException e){
					inputString = JOptionPane.showInputDialog(
						"Invalid order total. \n"
						+ "Please enter a number: ");
				}
			}
		}	
	System.exit(0);	
				
	}
}

//THIS EXAMPLE DOES NOT SOLVE "X" TO TERMINATE PROGRAM