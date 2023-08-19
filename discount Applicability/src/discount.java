import java.util.Scanner;

class discount{
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		double pa=scan.nextDouble();
		checkDiscount(pa);
		
	}
	public static void checkDiscount(double purchaseAmount) {
		if(purchaseAmount>100.0) {
			System.out.println("Discount Apllicable");
		}
	}
}