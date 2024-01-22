package kodnestarraylevel2;

import java.util.Scanner;

public class Anti_rotate_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		int n=scan.nextInt();
		Anti_rotate h1=new Anti_rotate();
		h1.anti(arr,n);
		System.out.println("after rotate");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
