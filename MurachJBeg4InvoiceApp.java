import javax.swing.JOptionPane;//needed to display dialog boxes
// NEW TO ME

public class MurachJBeg4InvoiceApp{
	public static void main(String[] args){
	//String choice = "";
		while(!(choice.equalsIgnoreCase("x"))){ 
			//NEW TO ME: something.equalsIgnoreCase("st")

			String inputString = JOptionPane.showInputDialog("Enter order total: ");
			// NEW TO ME: JOptionPane.showInputDialog("Some Input: ")


			double orderTotal = Double.parseDouble(inputString); 
			// NEW TO ME: parse to change the type of input
			double discountAmount = 0;
			if (orderTotal >= 100){
				discountAmount = orderTotal*.2;
			}
			else
				discountAmount = orderTotal*.1;
			double invoiceTotal = orderTotal - discountAmount;
			
			String message = "Order Total: " + orderTotal + "\n"
				+ "Discount Amount: " + discountAmount + "\n"
				+ "Invoice Total: " + invoiceTotal + "\n";
			//

			JOptionPane.showMessageDialog(null, message, "Invoice", JOptionPane.PLAIN_MESSAGE);
		}//end of while loop
		System.exit(0); // NEW TO ME
	}//end of main method
}//end of class