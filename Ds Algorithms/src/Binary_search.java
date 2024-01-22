import java.util.Scanner;

public class Binary_search {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan=new Scanner(System.in);
			int arr[]=new int[scan.nextInt()];
			for(int i=0;i<=arr.length-1;i++) {
				arr[i]=scan.nextInt();
			}
			int low = 0;
			int high=arr.length-1;
			int mid=(low+high)/2;
			int key=25;
			while(low<=high) {
				if(key==arr[mid]) {
					System.out.println("key is found at"+mid);
					break;
				}
				else if(key>arr[mid]) {
					low=mid+1;
				}
				else {
					high=mid-1;
				}
				mid=(low+high)/2;
				
			}
			if(low>high) {
				System.out.println("key is not found");
			}

	}

}
