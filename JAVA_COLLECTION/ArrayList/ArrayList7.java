
import java.util.ArrayList;

public class ArrayList7{
	public static void main(String[] args){

		ArrayList<String> names = new ArrayList<>();

		names.add("Pooja");
		names.add("Himanshu");
		names.add("Bob");
		names.add("Salendar");
		names.add("Rudrika");
		names.add("Sima");
	/*
		if(names.contains("Pooja"))
			System.out.println("Pooja is present");
		else
			System.out.println("Pooja is not present");
	*/

		String Contains = names.contains("Pooja")? "Yes" : "No";
		System.out.println("Conatains 'Pooja' : " + Contains);
	}
}