import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int arr[][][]=new int [2][][];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("entern the second dimensional array");
			arr[i]=new int [scan.nextInt()][];
		}
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("entern the three dimensional array");
				arr[i][j]=new int[scan.nextInt()];
			}
		}
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				for(int k=0;k<=arr[i][j].length-1;k++) {
					System.out.println("enter school "+i+" class "+j+" student "+k);
					arr[i][j][k]=scan.nextInt();
					
				}
			}
		}
		System.out.println("array contents are ....................");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				for(int k=0;k<=arr[i][j].length-1;k++) {
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		

	}

}
