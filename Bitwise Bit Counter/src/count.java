import java.util.Scanner;

public class count {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int a=scan.nextInt();
		System.out.println(countSetBits(a));
	}
	public static int countSetBits(int n) {
		int count=0;
		while(n>0) {
			count += n & 1;
			n >>=1;
		}
		return count;
		
	}

}
