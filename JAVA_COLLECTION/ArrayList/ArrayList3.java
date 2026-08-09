import java.util.ArrayList;
public class ArrayList3{
	public static void main(String[] args){
		ArrayList<Character> charList = new ArrayList<>();
		charList.add('H');
		charList.add('I');
		charList.add('M');
		charList.add('A');
		charList.add('N');
		charList.add('S');
		charList.add('H');
		charList.add('U');
		System.out.println("Element at index 7 : " + charList.get(7));
	}
}