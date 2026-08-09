public class StringBasic{
	public static void main(String[] args){
		String str = "Aditya Jain";
		System.out.println(str +" \nNumber of characters:" + str.length());
		System.out.println("First Name:" + str.substring(0,6));
		System.out.println("Last Name:" + str.substring(7));

		String str1 = "Java";
		String str2 = "Java";
		System.out.println("Strings are equal: " + str1.equals(str2));

		System.out.println(str.toUpperCase());
		System.out.println(str);
		System.out.println(str.toLowerCase());
		System.out.println(str);
	
	}
}