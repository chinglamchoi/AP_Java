import java.util.Arrays;
public class rect {
	int x, y, width, height;
	public rect() {
		x=0; y=0; width=2; height=2;
	}
	public static void main(String[] args) {
		rect rect1 = new rect();
		String[] pattern = new String[rect1.width];
		Arrays.fill(pattern, "#");
		for (int i=0; i<rect1.height; i++) {
			for (String o: pattern) {
				System.out.print(o);
			}
			System.out.println("");
		}
	}
}
