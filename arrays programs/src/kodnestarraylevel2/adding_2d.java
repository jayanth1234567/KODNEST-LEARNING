package kodnestarraylevel2;

import java.util.Scanner;

public class adding_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int arr[][]=new int[a][b];
		int arr2[][]=new int[a][b];
		int arr3[][]=new int[a][b];
		System.out.println("enter the first array elements");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr.length-1;j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("enter the second array elements");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr.length-1;j++) {
				arr2[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr.length-1;j++) {
				arr3[i][j]=arr[i][j]+arr2[i][j];
			}
		}
		System.out.println("array1 ");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr.length-1;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("array2");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr.length-1;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("array3");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr.length-1;j++) {
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}

	}

}
