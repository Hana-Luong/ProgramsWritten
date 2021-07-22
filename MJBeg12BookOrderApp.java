import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class MJBeg12BookOrderApp{
	public static void main(String[] args){
		String choice = "";
		while(!(choice.equalsIgnoreCase("x"))){
			String code = JOptionPane.showInputDialog("Enter book code: ");
			String title = "";
			double price = 0.0;
			if (code.equalsIgnoreCase("WARP")){
				title = "War and Peace";
				price = 14.95;
			}
			else if(code.equalsIgnoreCase("MBDK")){
				title = "Moby Dick";
				price = 12.95; 
			}
			else{
				title = "Not Found";
				price = 0.0; 
			}
			String inputQuantity = JOptionPane.showInputDialog("Enter quantity: ");
			int quantity = Integer.parseInt(inputQuantity);

			double total = quantity * price;
			NumberFormat currency = NumberFormat.getCurrencyInstance();

			String message = "Code: " + code +"\n"
				+ "Title: " + title + "\n"
				+ "Price: " + currency.format(price) + "\n"
				+ "Quantity: " + quantity + "\n"
				+ "Total: " + currency.format(total) + "\n"
				+ "Press Enter to contintue or enter 'x' to exit";
			choice = JOptionPane.showInputDialog(null, message, "Book Order", JOptionPane.PLAIN_MESSAGE);

		}
	System.exit(0); 
	}
}