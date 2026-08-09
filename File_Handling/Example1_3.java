// Check if string s contains any whitespace character.

import java.util.regex.*;
public class Example1_3{
	public static void main(String[] args){
		String s = "Hello World" ;
		String Whitespace = "\\s";
		Pattern p = Pattern.compile(Whitespace);	
		Matcher m = p.matcher(s);

	// find() returns true if any match exists
		boolean isWhitespace = m.find();
		System.out.println(isWhitespace);
	}
}