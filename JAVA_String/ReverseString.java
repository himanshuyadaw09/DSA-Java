public class ReverseString{
	public static String reverse(String ip){
		String result = "";
		for ( int i = ip.length()-1; i >= 0; i--){
			result += ip.charAt(i);
		}
		return result;
	}


	public static void reverse2(String ip){
		String result = "";
		for ( int i = 0; i < ip.length(); i++){
			result = ip.charAt(i) + result;
			System.out.println(result);
		}
	}
	
	public static void main(String[] args){
		String str = "Hello Java";
		// StringBuilder Reverse method
		String reversed = new StringBuilder(str).reverse().toString();
		System.out.println("Reversed String : " + reversed);
		
		String ip = "Java Progrmaing";
		System.out.println("Reversed String: " + reverse(ip));
		reverse2(ip);
	}
}
		