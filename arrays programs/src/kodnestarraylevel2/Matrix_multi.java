package kodnestarraylevel2;

import java.util.Scanner;

public class Matrix_multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int length=scan.nextInt();
		int length1=scan.nextInt();
		int[][] a=new int [length][length1];
		int[][] b=new int[length][length1];
		int[][] c=new int[length][length1];
		System.out.println("enter the 1st array elements");
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a.length-1;j++) {
				a[i][j]=scan.nextInt();
			}
		}
		System.out.println("enter the 2st array elements");
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a.length-1;j++) {
			b[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a.length-1;j++) {
				for(int k=0;k<=a.length-1;k++) {
					c[i][j]=a[i][j]*b[i][j];
				}
			}
		}
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a.length-1;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
