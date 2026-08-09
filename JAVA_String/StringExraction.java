public class StringExraction{
	public static void main(String[] args){
		String str = "Java Programming Language";
		String[] word = str.split(" ");
		System.out.println(str);
		for(String s : word){
			System.out.println(s);
		}
		System.out.println(word[0]);
		System.out.println(str.isEmpty());

	}
}