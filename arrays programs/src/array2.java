import java.util.Scanner;
public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

				Scanner scan=new Scanner(System.in);
				String[]arr=new String[8];
				for(int i=0;i<=arr.length-1;i++) {
					System.out.println("enter element ");
					arr[i]=scan.nextLine();
				}
				System.out.println("array elements are ....");
				for(int i=0;i<=arr.length-1;i++) {
					System.out.print(arr[i]+" ");
				}
				


	}

}
