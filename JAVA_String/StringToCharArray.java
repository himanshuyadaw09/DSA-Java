public class StringToCharArray{
	public static void main(String[] args){
		String str = "Hello";
		System.out.println(str.indexOf("H"));
		char[] charArray = str.toCharArray();
		for(char c : charArray){
			System.out.println(c);
		}
		System.out.println(str);
	}
}