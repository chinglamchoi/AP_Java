public class casting_and_logic {
	public static void main(String[] args) {
		int foo = 1;
		double bar;
		bar = foo; //widening casting
		bar += 1.9;
		bar --;
		foo = (int) bar; //narrowing casting: manual (truncates to int)
		System.out.println(foo);
		System.out.println(bar);
		bar ++;
		System.out.println(bar);
	}
}

// ++ -- for + or - 1
// && AND;  || OR;  ! NOT;
// Bitwise: & AND;  | OR;  ^ XOR;
// >> (shiftright) << (shiftleft) (bitwise)
