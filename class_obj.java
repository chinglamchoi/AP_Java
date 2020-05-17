public class class_obj {
	int x = 5; // final int x = 5; (modifier) to ban overriding of attribute value
	int y = 6;

	public int foo(int x, int y) {
		int z = x+y;
		return z;
	}

	public static void main(String[] args) {
		class_obj obj1 = new class_obj();
		int c = class_obj.foo(obj1.x, obj1.y);
		System.out.println(c);
	}
}


/*
Object-Oriented Programming:
- faster & easier to execute
- provides clear structure for programs
- keeps code D(on't) R(epeat) Y(ourself) >> easier to maintain/modify/debug
- less code, shorter dev time
*/

/*
 Classes & Objects (& attributes & methods):
 - class is a constructor of objects
 - object is an instance of a class
 - class objects inherit all vars and methods from the class
 - an object has attributes & methods
 */

// public void: defined for (all?) instances of class and not for class itself?
