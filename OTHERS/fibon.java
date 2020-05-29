public class fibon {

	public static void main(String[] args) {
		long x = 0;
		long y = 1;
		for (int i = 0; i < 10; i++) {
			System.out.println(y);
			x = x+y;
			System.out.println(x);
			y = x+y;
		}
	}
}
