package kodnestarraylevel2;

import java.util.Scanner;

public class Anti_rotate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("before rotate");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("enter the number if rotates");
		int n=scan.nextInt();			
		for(int j=1;j<=n;j++) {
		int temp=arr[0];
		for(int i=1;i<=arr.length-1;i++) {
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
		}
		System.out.println("after rotate");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
