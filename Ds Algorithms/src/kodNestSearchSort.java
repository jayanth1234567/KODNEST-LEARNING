import java.util.Scanner;

public class kodNestSearchSort {
	int linearSearch(int arr[],int key)
	{
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
	return -1;
	}

	int binarySearch(int arr[],int key)
	{
		Scanner  scan=new Scanner(System.in);
		System.out.println("enter the elements are sorted or not if not sorted enter false if sorted enter true");
		boolean b=scan.nextBoolean();
		if(b==false) {
			System.out.println("press1------->bubble");
			System.out.println("press2------->selection");
			System.out.println("press3------->insertion");
		}
		int choice=scan.nextInt();
		switch(choice) {
		case 1:
			bubbleSortAscending(arr);
			break;
		case 2:
			selectionSortAscending(arr);
			break;
		case 3:
			insertionSortAscending(arr);
			break;
		default:System.out.println("go to vaasan eye care and come back");
			
		}
		int low = 0;
		int high=arr.length-1;
		int mid=(low+high)/2;
		while(low<=high) {
			if(key==arr[mid]) {
				return mid;
			}
			else if(key>arr[mid]) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
			mid=(low+high)/2;
			
		}
	return -1;
	}
	void bubbleSortAscending(int arr[])
	{
		for(int i=0;i<=arr.length-2;i++) {
			for(int j=0;j<=arr.length-2-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}

	}

	void bubbleSortDescending(int arr[])
	{
		for(int i=0;i<=arr.length-2;i++) {
			for(int j=0;j<=arr.length-2-i;j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}


	}

	void selectionSortAscending(int arr[])
	{
		for(int i = 0;i<=arr.length-2;i++) {
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
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}

	}

	void selectionSortDescending(int arr[])

	{
		for(int i = 0;i<=arr.length-2;i++) {
			int min=arr[i];
			int pos=i;
			for(int j=i+1;j<=arr.length-1;j++) {
				if(min<arr[j]) {
					min=arr[j];
					pos=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}


	}

	void insertionSortAscending(int arr[])

	{
		for(int i=1;i<=arr.length-1;i++) {
			int item=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>arr[i]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
		}
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}


	}

	void insertionSortDescending(int arr[])

	{
		for(int i=1;i<=arr.length-1;i++) {
			int item=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]<arr[i]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
		}
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}


	}

	int findMinimum(int arr[])

	{
		
		bubbleSortAscending(arr);
		
		

	return arr[0];

	}

	int findMax(int arr[])

	{
		bubbleSortAscending(arr);
	return arr[arr.length-1];

	}

}
