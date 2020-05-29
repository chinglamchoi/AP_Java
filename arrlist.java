import java.util.ArrayList;

// - cannot be used for primitive types (need wrapper)
// - mutable, contains object references
// - can hold multiple types (not recommended)

public class arrlist {
	ArrayList grid = new ArrayList(5);
	// ArrayList<Integer> grid = new ArrayList<Integer>(5); for fixed type
	public arrlist() {
		for (int i=0; i<5; i++) {
			grid.add(i);
		}
		grid.add("h"); //6th
	}
	public static void main(String[] args) {
		arrlist list = new arrlist();
		list.grid.set(list.grid.size()-1, 5); // can overwrite type
		for (int i=0; i< list.grid.size(); i ++) {
			System.out.print(list.grid.get(i));
		}
	}
}
