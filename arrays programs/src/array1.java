import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner scan=new Scanner(System.in);
				int[]arr=new int[5];
				for(int i=0;i<=arr.length-1;i++) {
					System.out.println("enter element ");
					arr[i]=scan.nextInt();
				}
				System.out.println("array elements are ....");
				for(int i=0;i<=arr.length-1;i++) {
					System.out.print(arr[i]+" ");
				}
				

	}

}
