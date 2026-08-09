/* Check weather a string s contains 
	only English letters(upper or lowercase).
*/

import java.util.regex.*;
public class Example1_2{
	public static void main(String[] args){
		String s = "HiYadav"; 
		Pattern p = Pattern.compile("^[A-Za-z]+$");
		Matcher m = p.matcher(s);
		boolean isAlpha = m.matches();
		System.out.println(isAlpha);
	}
}
		