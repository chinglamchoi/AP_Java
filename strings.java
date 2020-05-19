public class strings {
	public static void main(String[] args) {
		String txt = "ABCA";
		txt = txt.concat("hey");
		int txt2 = 2;
		txt += txt2; // can add int/char/str to string
		char txt_char = 'c';
		txt += txt_char;
		txt_char = txt.charAt(0); // Find n'th index
		int txt_char1 = txt.indexOf("A"); // Find index of n (first occurrence)
		int len = txt.length(); // length
		System.out.println(txt_char1);
		System.out.println(txt);
		System.out.println(len);
		txt = txt.toUpperCase(); // upper
		txt = txt.toLowerCase(); // lower
	}
}
// Java is zero-indexed

/*
 Method for Strings:
 - txt.charAt([index])
 - txt.length()
 - txt.toUpperCase()
 - txt.toLowerCase()
 - txt.indexOf([substring])
 - txt.concat([String or String var])
 */

/*
 \ usage:
 - escape chars
 - \n new line
 - \r Carriage Return (back to beginning of line)
 - \t tab
 - \b backspace
 - \f Form Feed (paeg break)
 */

