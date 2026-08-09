// Print/List all vowels in "Regular Expressions!".

import java.util.regex.*;
public class Example1_5{
	public static void main(String[] args){
		String ip = "Regular Expressions!";
		String vowelregex = "[AEIOUaeiou]";
		Pattern p = Pattern.compile(vowelregex);
		Matcher m = p.matcher(ip);
		while(m.find()){
			// m.group() returns matched substring 
			System.out.println(m.group());
		}
	}
}