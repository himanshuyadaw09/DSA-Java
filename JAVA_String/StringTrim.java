public class StringTrim{
	public static void main(String[] args){
		String str = "   Java Programming    ";
		int n = str.length();
		String trim_str = str.trim();
		int m = trim_str.length();
		System.out.println(str + " ----> " + n);
		System.out.println(trim_str + " ----> " + m);
	}
}