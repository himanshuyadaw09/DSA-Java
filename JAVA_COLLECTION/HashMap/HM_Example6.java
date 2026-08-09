// iterate over the keys and print each key with it's corresponding value.

import java.util.HashMap;
public class HM_Example6{
	public static void main(String[] args){
		HashMap<String,String> capitals = new HashMap<>();
		capitals.put("India "," Delhi");
		capitals.put("America "," Washington DC");
		capitals.put("France "," Paris");
		capitals.put("Japan "," Tokyo");
		capitals.put("Canada " ," Ottawa");
 		for( String country : capitals.keySet()){
			System.out.println(country + " -> " + capitals.get(country));
		}
	}
}