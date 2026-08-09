public class NumberVowels{
	public static void main(String[] args){
		String str = "Himanshu Yadav Ji";
		String stri = str.toLowerCase();
		int count = 0;
		for( int i = 0; i < stri.length(); i++ ){
			char ch = stri.charAt(i);
			if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){ 
				count++;
			}
		}
		System.out.println(count);
	}
}
				