import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int arr[]=new int [scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("elements before sorting ");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		kodNestSearchSort k=new kodNestSearchSort();
		while(true) {
			System.out.println("enter your choice");
			System.out.println("press1----------->Searching");
			System.out.println("press2----------->Sorting");
			System.out.println("press3----------->finding minimum or maximum");
			System.out.println("press any other for --> TATA BYE BYE ...");
			int choice=scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Linear Search -->1 or Binary Search-->2");
				int choice1=scan.nextInt();
				if(choice1==1) {
					System.out.println("enter key to search");
					int key=scan.nextInt();
					int res=k.linearSearch(arr,key);
					if(res!=-1) {
						System.out.println("key found at"+res);
						
					}
					else {
						System.out.println("key not found");
						
					}
				}
				else if(choice1==2) {
					System.out.println("enter key to search");
					int key=scan.nextInt();
					int res=k.binarySearch(arr,key);
					if(res!=-1) {
						System.out.println("key found at"+res);
						
					}
					else if(res==-1){
						System.out.println("key not found");
					}
					else {
						System.out.println("go to vaasan eye care and come back");
					}
				}
				else {
					System.out.println("go to vaasan eye care and come back");
					return;
				}
			break;
			case 2:
				System.out.println("press1-------->Bubble");
				System.out.println("press2-------->selection");
				System.out.println("press3-------->insertion");
				int choice2=scan.nextInt();
				if(choice2==1) {
					System.out.println("enter 1 for asc sort and 2 for desc sort");
					int choice3=scan.nextInt();
					if(choice3==1) {
						k.bubbleSortAscending(arr);
					}
					else if(choice3==2) {
						k.bubbleSortDescending(arr);
					}
					else {
						System.out.println("kATHAM BYE BYE TATA GAYA");
					}
					
				}
				else if(choice2==2) {
					System.out.println("enter 1 for asc sort and 2 for desc sort");
					int choice4=scan.nextInt();
					if(choice4==1) {
						k.selectionSortAscending(arr);
					}
					else if(choice4==2) {
						k.selectionSortDescending(arr);
					}
					else {
						System.out.println("KATHAM BYE BYE TATA GAYA");
					}
				}
				else if(choice2==3) {
					System.out.println("enter 1 for asc sort and 2 for desc sort");
					int choice5=scan.nextInt();
					if(choice5==1) {
						k.insertionSortAscending(arr);
					}
					else if(choice5==2) {
						k.insertionSortDescending(arr);
					}
					else {
						System.out.println("KATHAM BYE BYE TATA GAYA");
					}
				}
				else {
					System.out.println("go to vaasan eye care and come back");
					return;
				}
				break;
			case 3:
				System.out.println("press1-------->findMinimum");
				System.out.println("press2-------->findMaximum");
				int choice6=scan.nextInt();
				if(choice6==1) {
				int res=k.findMinimum(arr);
				System.out.println(res);
				}
				else if(choice6==2) {
				int res1=k.findMax(arr);
				System.out.println(res1);
				}
				else {
					System.out.println("go to vaasan eye care and come back");
					return;
				}
				break;
			default:System.out.println("KATHAM BYE BYE TATA GAYA");
			return;
			}
		}
	}

}

