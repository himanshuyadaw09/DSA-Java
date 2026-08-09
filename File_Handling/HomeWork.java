// From "A1B22C333", print each group of digits separately.

import java.util.regex.*;
public class HomeWork{
	public static void main(String[] args){
		String ip = "A1B22C333";
		String digits = "\\d+";
		Pattern p = Pattern.compile(digits);
		Matcher m = p.matcher(ip);
		while(m.find()){
			System.out.println(m.group());
		}
	}
}