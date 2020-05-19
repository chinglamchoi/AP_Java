public class methods {

	static void myMethod(String fname, String greeting) { 
		// static: method belongs to class & isn't obj of class
		// void: method doesn't have a return value
		System.out.println(greeting + fname);
	}

	static int[] MyMethod2(int x, int y) {
		x = x+y;
		y = x-y;
		x = x-y;
		return new int[] {x,y};
	}
	
	public static void main(String[] args) {
		// main method is compulsory in java
		String[][] names = {{"Alice!", "Bob!", "Charlie!"}, {"Morning ", "Afternoon ", "Evening "}};
		for (int i=0; i<names[0].length; i++) {
			myMethod(names[0][i], names[1][i]);
		}

		// calling myMethod2:
		int[] my_arr = MyMethod2(5, 3);
		System.out.println(my_arr[0] + " " + my_arr[1]);
	}
}
