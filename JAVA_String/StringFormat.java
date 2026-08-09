public class StringFormat{
	public static void main(String[] args){
		String name = "Pooja";
		int age = 22;
		String formattedString = String.format("Name: %s , Age: %d " ,name,age);
		System.out.println(formattedString);
	}
}