import java.util.Scanner;

public class array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		double[]arr=new double[10];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("enter element ");
			arr[i]=scan.nextDouble();
		}
		System.out.println("array elements are ....");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
