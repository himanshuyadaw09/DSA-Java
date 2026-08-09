public class NonRepeatingChar{
	public static void main(String[] args){
		String str = "Himanshu";
		for( int i = 0; i < str.length(); i++ ){
			if( str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i)) ){
				System.out.println("Non repeating character: " + str.charAt(i) );
				return;
			}
		}
	}
}