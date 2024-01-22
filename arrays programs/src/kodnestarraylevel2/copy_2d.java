package kodnestarraylevel2;

import java.util.Scanner;

public class copy_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int arr[][]=new int[scan.nextInt()][scan.nextInt()];
		System.out.println("enter second array elements");
		int arr2[][]=new int[scan.nextInt()][scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr.length-1;j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<=arr2.length-1;i++) {
			for(int j=0;j<=arr2.length-1;j++) {
				arr2[i][j]=arr[i][j];
			}
		}
		System.out.println("arr elemnts are");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr.length-1;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("arr2 elemnts are ");
		for(int i=0;i<=arr2.length-1;i++) {
			for(int j=0;j<=arr2.length-1;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}

	}

}
