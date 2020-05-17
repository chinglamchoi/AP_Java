class class_obj2 {
	public static void main(String[] args) {
		class_obj obj2 = new class_obj();
		class_obj obj3 = new class_obj();
		obj2.x = 6; // only modifies attribute for this object scope
		System.out.println(class_obj.x + " " + obj2.x + " " + obj3.x);
	}
}
