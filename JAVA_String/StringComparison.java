public class StringComparison{

	public static boolean equal(String str1, String str2){
		return str1.toLowerCase().equals(str2.toLowerCase());

	}

	public static void main(String[] args){
		String str1 = "ApPlE";
		String str2 = "aPpLe";

		System.out.println("CHECK : Is both String are equal? " + str1.equals(str2));

	// Method 1 - using standard Method
		System.out.println("Implement Method 1 \nIs both String are equal? " + str1.equalsIgnoreCase(str2));

	// Method 2 - without using standard Method
		System.out.println("Implement Method 2 \nIs both String are equal? " + equal(str1,str2));
	}
}