import java.util.Scanner;
import java.util.ArrayList;

public class stack { // LIFO
	ArrayList<Integer> stackk = new ArrayList<Integer>();
	public static void main(String[] args) {
		stack myStack = new stack();
		System.out.print("How many operations? ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		for (int i=0; i<num; i++) {
			System.out.print("Which operation? 0 (TOP), 1 (POP), 2 (SIZE), 3 (PUSH): ");
			int num1 = input.nextInt();
			int s = myStack.stackk.size();
			switch(num1) {
				case 0:
					String outt = (s==0) ? "Empty" : myStack.stackk.get(s-1).toString();
					System.out.println(outt);
					break;
				case 1:
					if (s==0) {
						System.out.println("Cannot pop");
					} else {
						myStack.stackk.remove(s-1);
					}
					break;
				case 2:
					System.out.println(s);
					break;
				case 3:
					System.out.print("What to push? ");
					int num2 = input.nextInt();
					myStack.stackk.add(num2);
					break;
			}
		}
	}
}
