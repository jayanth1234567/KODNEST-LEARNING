import java.util.Scanner;

public class arrays4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String arr[][]=new String [5][6];
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("enter name of bank"+i+"customer"+j);
				arr[i][j]=scan.nextLine();
			}
		}
		
		System.out.println("array contents are");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}


