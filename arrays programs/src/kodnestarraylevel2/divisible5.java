package kodnestarraylevel2;

import java.util.Scanner;

public class divisible5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[scan.nextInt()];
	
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
			
		}
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%5==0) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
