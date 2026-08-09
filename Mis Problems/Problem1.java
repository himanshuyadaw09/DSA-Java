import java.util.ArrayList;
public class Problem1{

	// Merge two ArrayList.

	public static void main(String[] args){

		ArrayList<String> name1 = new ArrayList<>();
		ArrayList<String> name2 = new ArrayList<>();
		
		name1.add("Himanshu");
		name2.add("Pooja");
		name1.add("Salendar");
		name2.add("Richa");
		name1.add("Vishal");
		name2.add("All");

		ArrayList<String> names = new ArrayList<>(name1);
		
		for( String n : name2){
			names.add(n);
		}
		
		System.out.println("1st ArrayList: " + name1);
		System.out.println("2nd ArrayList: " + name2);
		System.out.println("Merged ArrayList: " + names);

		name2.addAll(name1);
		System.out.println("After Merge list 1 into list 2: " + name2);
	}
}