/* Determine if a given String s consists entirely of digit[0-9].
	Hits: Use anchors ^ and $ around \d+.
*/

import java.util.regex.*;

public class Example1_1{
	public static void main(String[] args){
		String s = "2026";
		String onlyDigits = "^\\d+$";
	// 1. Complie a Pattern: start(^),digit+,end($)
		Pattern p = Pattern.compile(onlyDigits);
	// 2. Create a Matcher for the input string 
		Matcher m = p.matcher(s);
	// 3. matches() returns true only if the entire string matches
		boolean isDigitsOnly = m.matches();
	// 4. Print result
		System.out.println(isDigitsOnly);
	}
}