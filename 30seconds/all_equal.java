import java.util.Scanner;

public class all_equal {
	public static boolean check(String input1) {
		char target = input1.charAt(0);
		for (int i=1; i<input1.length(); i++) {
			if (!(input1.charAt(i) == target)) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner gen = new Scanner(System.in);
		String input1 = gen.nextLine();
		System.out.println(check(input1));
	}
}
