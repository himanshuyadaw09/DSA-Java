import java.util.ArrayList;
public class ArrayListAdv{
	public static void main(String[] args){
		ArrayList<String> names = new ArrayList<>();
		names.add("Pooja");
		names.add("Ruchita");
		names.add("Alice");
		names.add("Harsh");
		names.add("Ajay");
		names.add("Shivani");
		System.out.println("Before Inserstion List: " + names);
		names.add(1,"Bob");
		System.out.println("After Insertion List: " + names);
	}
}