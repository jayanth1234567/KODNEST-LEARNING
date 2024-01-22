import java.util.Scanner;

public class selection_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[scan.nextInt()];
		System.out.println("enter the array elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("before performing the selection sort");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<=arr.length-2;i++) {
			int min=arr[i];
			int pos=i;
			for(int j=i+1;j<=arr.length-1;j++) {
				if(min>arr[j]) {
					min=arr[j];
					pos=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
		System.out.println();
		System.out.println("after performing the selection sort");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
