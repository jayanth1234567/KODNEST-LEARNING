package kodnestarraylevel2;

public class Anti_rotate {
	public static void  anti(int[] arr, int n) {
		for(int j=1;j<=n;j++) {
			int temp=arr[0];
			for(int i=1;i<=arr.length-1;i++) {
				arr[i-1]=arr[i];
			}
			arr[arr.length-1]=temp;
			}

	}

}
