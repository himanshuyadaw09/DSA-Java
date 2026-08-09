public class StringContains{
	public static void main(String[] args){
		String str = "Java Programming";
		System.out.println(str.contains("Java"));
		System.out.println(str.contains(" Java".trim()));
		System.out.println(str.toLowerCase().contains(" Java".trim().toLowerCase()));
	}
}