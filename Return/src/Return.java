
public class Return {

	public static void main(String[] args) {
	int x=10;
	int y= myFunc(x);
	System.out.println(y);
	}

	private static int myFunc(int x) {

		return x*4;
	}

}
