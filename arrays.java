public class arrays {
	public static void main(String[] args) {
		String[] nums = {"one", "two", "three", "four", "five"};
		int[] numbers = {1, 2, 3, 4, 5};
		nums[0] = "1";
		System.out.println(nums.length + "\n");

		// loop by index through array
		for (int i=0; i<5; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("\n");

		// loop by element through array
		for (String i : nums) {
			System.out.println(i + "\n");
		}

		// multi-dimensional arrays
		int[][] twod = {{1,2,3}, {4,5,6,7}}; // twod[0][1] = 2
		// System.out.println(twod[0].length + " " + twod[1].length);
		for (int j=0; j < twod.length; j++) {
			for (int k=0; k < twod[j].length; k++) {
				System.out.println(twod[j][k]);
			}
		}
	}
}
