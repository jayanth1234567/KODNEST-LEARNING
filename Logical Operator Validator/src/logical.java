
public class logical {

	public static void main(String[] args) {
		boolean a=true;
		boolean b=true;
		boolean y=isValidInput( a, b);
		System.out.println(y);

	}
	public static boolean isValidInput(boolean a,boolean b) {
		boolean g=a&&b;
	
		return g;
	}

}
