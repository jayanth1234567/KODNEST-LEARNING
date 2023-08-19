import java.util.Scanner;

public class join {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String a=scan.next();
		String b=scan.next();
		scan.close();
		System.out.println(joinStrings(a,b));
		

	}
	public static String joinStrings(String Str1,String str2) {
		
		
		return Str1 +" "+str2;
	}

}
