package kodnestarraylevel2;

import java.util.Scanner;

public class merge_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int arr[]=new int[scan.nextInt()];
		int arr1[]=new int[scan.nextInt()];
		int a=arr.length+arr1.length;
		int arr2[]=new int[a];
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
			
		}
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=scan.nextInt();
			
		}
		
		for(int i=0;i<=arr.length-1;i++) {
			arr2[i]=arr[i];
		}
		for(int i=arr.length;i<=arr2.length-1;i++){
			arr2[i]=arr1[i-arr.length];
			
		}
		for(int i=0;i<=arr2.length-1;i++) {
			System.out.print(arr2[i]+" ");
			
		}
				

	}

}
