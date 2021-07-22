import javax.swing.JOptionPane;
import java.text.*;

public class MurachJBeg8TryCatch{
	public static void main(String[] args){
		String inputString = JOptionPane.showInputDialog("Enter order total: ");
		double orderTotal = 0;
		try{
			orderTotal = Double.parseDouble(inputString);		
		}
		catch(NumberFormatException e){
		// REMEMBER NumberFormatException
			inputString = JOptionPane.showInputDialog(
				"Invalid order total. \n"
				+ "Please enter a number: ");
			orderTotal = Double.parseDouble(inputString); 
		}


		String choice = "";
		try{
			while(!(choice.equalsIgnoreCase("X"))){
				choice = JOptionPane.showInputDialog(
					"Press Enter to continue or enter 'x' to exit.");
			}
		}

		catch(NullPointerException e){
			System.exit(0);			 
		}
	}
}