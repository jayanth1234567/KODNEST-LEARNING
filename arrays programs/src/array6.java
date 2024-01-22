import java.util.Scanner;

public class array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		double arr[][]=new double [5][];
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=new double[scan.nextInt()];
		}
		
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("enter name of game "+i+" players"+j);
				arr[i][j]=scan.nextDouble();
				scan.close();
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
