import java.util.Random;
import java.lang.Math;


public class prime {
	private static boolean checkPrime(int x) {
		for (int i=2; i < (int) (Math.sqrt(x)+0.5); i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}
	private static void check2() {
		Random gen = new Random();
		int a = gen.nextInt(200);
		System.out.println("Number chosen = " + a);
		String msg = checkPrime(a) ? "Prime" : "Not prime";
		System.out.println(msg);
	}

	public static void main(String[] args) {
		check2();
	}
	
}

