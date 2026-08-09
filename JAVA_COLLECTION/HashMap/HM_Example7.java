// gate size and clear

import java.util.HashMap;
public class HM_Example7{
	public static void main(String[] args){
		HashMap<String,String> capitals = new HashMap<>();
		capitals.put("India "," Delhi");
		capitals.put("America "," Washington DC");
		capitals.put("France "," Paris");
		capitals.put("Japan "," Tokyo");
		capitals.put("Canada " ," Ottawa");
		int n = capitals.size();
		System.out.println("Size: " + n);
		capitals.clear();
		System.out.println("After Clear Size : " + capitals);
	}
}