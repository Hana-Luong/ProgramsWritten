import java.text.*; 

public class MurachJBeg7NumberFormat{
	public static void main(String[] args){
		double price = 11.575;
		NumberFormat currency = NumberFormat.getCurrencyInstance();//instantiate
		String priceString = currency.format(price);// has to be a string
		System.out.println(priceString); 

		double majority = .512;
		NumberFormat percent = NumberFormat.getPercentInstance();
		String majorityString = percent.format(majority); 
		System.out.println(majorityString);

		double miles = 15341.256;
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(1);
		String milesString = number.format(miles);
		System.out.println(milesString);

		double orderTotal = 150; 
		double discountAmount = 0;
		
		if (orderTotal >= 100){
			discountAmount = orderTotal*.2;
		}
		else
			discountAmount = orderTotal*.1;

		double invoiceTotal = orderTotal - discountAmount;
			
		String message = "Order Total: " + currency.format(orderTotal) + "\n"
				+ "Discount Amount: " + currency.format(discountAmount) + "\n"
				+ "Invoice Total: " + currency.format(invoiceTotal);
		System.out.println(message);		
		
		String majorityStringOneLine = NumberFormat.getPercentInstance().format(majority);
		System.out.println(majorityStringOneLine); 
		
		System.exit(0);		

	}
}