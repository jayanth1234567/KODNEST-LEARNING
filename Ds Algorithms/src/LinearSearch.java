import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int arr[]=new int [scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("enter the key valuse ");
		int key=scan.nextInt();
		for(int i=0;i<=arr.length-1;i++) {
			if(key==arr[i]) {
				System.out.println("key is found at"+i);
				return ;
			}
		}
		System.out.println("key is not found");
	}

}
