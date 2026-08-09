// Updating the Existing value 

import java.util.HashMap;
public class HM_Example3{
	public static void main(String[] args){
		HashMap<String,String> capitals = new HashMap<>();
		capitals.put("India "," Delhi");
		capitals.put("America "," Washington DC");
		capitals.put("France "," Paris");
		capitals.put("Japan "," Tokyo");
		capitals.put("Canada " ," Ottawa");
		capitals.put("India " , " Kolkata");
		System.out.println("Country Capitals: " + capitals);
	}
}