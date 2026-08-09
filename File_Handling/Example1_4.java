// Verify that string s consists only of letters,digits,or underscore.

import java.util.regex.*;
public class Example1_4{
	public static void main(String[] args){
		String s = "User_123";
		String check = "^[A-Za-z0-9_]+$";
		String ckeck2 = "\\w+$";
		Pattern p = Pattern.compile(check);
		boolean ok = p.matcher(s).matches();
		System.out.println(ok);
	}
}