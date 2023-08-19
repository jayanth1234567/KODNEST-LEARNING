import java.util.Scanner;

public class doubletrouble {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int num=scan.nextInt();
		scan.close();
		System.out.println(doublethenumber( num));
		
	

	}
	public static int doublethenumber(int num) {
		
		return num+num;
	}

}
