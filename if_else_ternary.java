public class if_else_ternary {
	public static void main(String[] args) {
		int a = 1, b = 2;
		if (a > b) {
			System.out.println("a bigger");
		} else if (a == b) {
			System.out.println("equal");
		} else {
			System.out.println("a smaller");
		}
		int t = a;
		a = b;
		b = t;
		boolean valid = a > b ? true : false;
		System.out.println(valid);
	}
}
