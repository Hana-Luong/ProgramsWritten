import javax.swing.JOptionPane;//needed to display dialog boxes


public class MurachJBeg6InvoiceApp{
	public static void main(String[] args){
	String choice = "";
		while(!(choice.equalsIgnoreCase("n"))){ 
			
			String inputString = JOptionPane.showInputDialog("Enter order total: ");
			
			double orderTotal = Double.parseDouble(inputString); 
			double discountAmount = 0;
			if (orderTotal >= 100){
				discountAmount = orderTotal*.2;
			}
			else
				discountAmount = orderTotal*.1;

			double invoiceTotal = orderTotal - discountAmount;

			String message = "Order Total: " + orderTotal + "\n"
				+ "Discount Amount: " + discountAmount + "\n"
				+ "Invoice Total: " + invoiceTotal + "\n"
				+ "Continue (Y/N)?.\n";
			
			choice = JOptionPane.showInputDialog(null, message, "Invoice", JOptionPane.DEFAULT_OPTION);
		}
		System.exit(0);
	}
}