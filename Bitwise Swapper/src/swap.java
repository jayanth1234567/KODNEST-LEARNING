import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a = scan.nextInt();
		int b= scan.nextInt();
		swapUsingBitwise(a,b);
		
		

	}
	public static void swapUsingBitwise(int a,int b) {
		int temp;
		System.out.println(a+" "+b);
		temp=b;
		a=a^b;
		b=a^b;
		a=temp;
		System.out.println(a+" "+b);
		
	}

}
