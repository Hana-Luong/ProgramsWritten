import javax.swing.JOptionPane;
import java.text.*;


public class MurachJBeg10EnhancedInvoiceApp{
	public static void main(String[] args){
		String choice = "";
		while(!(choice.equalsIgnoreCase("x"))){
			String inputString = JOptionPane.showInputDialog("Enter orderTotal: ");
			double orderTotal = parseTotal(inputString); //parseTotal is a STATIC method I write
		}
	System.exit(0);
	}

	private static double parseTotal(String totalString){//totalString 
		double orderTotal = 0;//declared here. 
		boolean tryAgain = true;
		while(tryAgain){
			try{
				orderTotal = Double.parseDouble(totalString);
				while(orderTotal<=0){
					totalString = JOptionPane.showInputDialog(
						"Invalid order total.\n" + "Please enter a positive number: ");
					orderTotal = Double.parseDouble(totalString);
				}
				tryAgain = false;
			}						
			catch(NumberFormatException e){
				totalString = JOptionPane.showInputDialog(
					"Invalid order total.\n" + "Please enter a number: ");
			}		
		}
		return orderTotal;

	}
}