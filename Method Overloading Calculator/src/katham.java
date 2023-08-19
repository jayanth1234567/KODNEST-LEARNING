import java.util.Scanner;

public class katham {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a =scan.nextInt();
		int b=scan.nextInt();
		char c=scan.next().charAt(0);
		System.out.println(calculate(a,b,c));
		
	}
	public static int calculate(int b,int a,char c) {
		switch(c) {
		case '+':
			
			break;
		
		}
		return b+a;
	}
	public static int calculate(byte a,byte b,char c) {
		switch(c) {
		case '-':
			break;
		
		}
		
		return a-b;
	}
	public static int calculate(short a,short d,char c) {
		switch(c) {
		case '*':
			break;
		
		}
		return a-d;
	}
	public static int calculate(double y, double x,char c) {
		switch(c) {
		case '/':
			break;
		
		}
		return (int) (y/x);
	}

}
