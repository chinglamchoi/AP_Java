public class types {
	public static void main(String[] args) {
		int foo = 1, bar = 2, foobar = foo+bar;
		byte a = 127;
		short b = 32767;
		long c = 50L;
		double d = 19.99E4d; // Only floating pt, capital
		float foo1 = 1.1e4f; // lowercase
		char foo2 = 'A';
		boolean foo3 = true;
		System.out.println(foobar);
		System.out.println(foo1);
		System.out.println(foo2);
		System.out.println(foo3);
	}
}
// single line comment

/*
 Primitive data types: byte, short, int, long, float, double, boolean, char
 Non-primitve: String, Arrays, Classes
 */

//non-primitive types (except String) are defined by user
//Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
//Only Non-primitive types can be null
//primitive type = lower, non = upper
//size of primitive depends on type, size of all non = the same
