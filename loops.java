public class loops {
	public static void main(String[] args) {

		int i = 0;
		while (i < 5) { // checks before running
			System.out.println(i);
			i ++;
		}
		System.out.println("\n");

		i = 0;
		do { // runs once before checking
			System.out.println(i);
			i++;
		} while (i < 5);
		System.out.println("\n");

		for (int o = 0; o < 5; o ++) {
			if (o == 3) {
				continue; // skip without printing
			}
			if (o == 4) {
				break;
			}
			System.out.println(o);
		}
	}
}
