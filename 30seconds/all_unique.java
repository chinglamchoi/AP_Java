import java.util.Scanner;

public class all_unique {
	public static boolean check(String list) {
		char target = list.charAt(0);
		for (int i=1; i<list.length(); i++) {
			if (list.charAt(i) == target) return false;
		} return true;
	}
	public static void main(String[] args) {
		Scanner gen = new Scanner(System.in);
		String check_me = gen.nextLine();
		System.out.println(check(check_me));
	}
}
