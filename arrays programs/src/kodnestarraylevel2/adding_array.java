package kodnestarraylevel2;

import java.util.Scanner;

public class adding_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[scan.nextInt()];
		int arr1[]=new int[arr.length];
		int arr2[]=new int[arr.length];
		System.out.println("enter 1st array elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
			
		}
		System.out.println("enter 2st array elements");
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=scan.nextInt();
			
		}
		System.out.println("sum of array elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr2[i]=arr[i]+arr1[i];
			
		}
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr2[i]+" ");
			
		}
		

	}

}
