public class Palindrome{
	public static void main(String[] args){
		String str = "naman";
		String reversed = new StringBuilder(str).reverse().toString();
		if( str.equals(reversed) ){
			System.out.println("Palindrome !");
		}
		else 
			System.out.println("Not a Palindrome!");
	}
}