import java.util.Scanner;

class addition{
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
				long a=scan.nextLong();
		long b=scan.nextLong();
		scan.close();
		System.out.println(galacticAddition(a,b));
		
	}
	public static long galacticAddition(long num1,long num2) {
		
		return num1+num2;
		
	}
}