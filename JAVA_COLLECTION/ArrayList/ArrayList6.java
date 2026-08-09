import java.util.ArrayList;
public class ArrayList6{
	public static void main(String[] args){
		ArrayList<String> names = new ArrayList<>();
		names.add("Pooja");
		names.add("Himanshu");
		names.add("Salendar");
		names.add("Rudrika");
		names.add("Sima");
		for( String name : names)
			System.out.println(name);

		System.out.println(names);
	}
}