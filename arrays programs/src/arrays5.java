import java.util.Scanner;

public class arrays5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		double arr[][]=new double [5][];
		arr[0]=new double[3];
		arr[1]=new double[2];
		arr[2]=new double[4];
		arr[3]=new double[5];
		arr[4]=new double[7];
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("enter name of game "+i+" players"+j);
				arr[i][j]=scan.nextDouble();
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
