import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double purchase_amount=scan.nextDouble();
		double tax_rate=scan.nextDouble();
		double y=calculateTotalWithTax(purchase_amount,tax_rate);
		System.out.println(y);
		

	}
	public static double calculateTotalWithTax(double purchase_amount, double tax_rate) {
		
		double x=purchase_amount*tax_rate;
		
		return purchase_amount+x;
		
	}

}
