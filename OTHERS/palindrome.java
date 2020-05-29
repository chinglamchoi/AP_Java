import java.util.Random;
import java.util.Scanner;

public class palindrome {
	private static String genWord() {
		Random gen = new Random();
		char[] charArr = new char[8];
		for (int i=0; i < 8; i++) {
			charArr[i] = (char) (gen.nextInt(26)+65);
		}
		String StringArr = new String(charArr);
		return StringArr;
	}

	private static String checkPalindrome(String a) {
		int i = a.length();
		if (i % 2 == 0) {
			int i1 = (int) (i /2 -1);
			String a1 = a.substring(0, i1+1);
			String a2 = a.substring(i1+1, i);
			String msg = a1.equals(a2) ? "palindrome" : "not palindrome";
			return msg;
		} else {
			int i1 = (int) (i/2 + 0.5);
			String a1 = a.substring(0, i1);
			String a2 = a.substring(i1+1, i);
			String msg = a1.equals(a2) ? "palindrome" : "not palindrome";
			return msg;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in_ = sc.nextLine();
		System.out.println("Your input was \'" + in_ + "\'");
		System.out.println(checkPalindrome(in_));
	}
}
