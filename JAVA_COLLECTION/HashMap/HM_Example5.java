// check is contains

import java.util.HashMap;
public class HM_Example5{
	public static void main(String[] args){
		HashMap<String,String> capitals = new HashMap<>();
		capitals.put("India "," Delhi");
		capitals.put("America "," Washington DC");
		capitals.put("France "," Paris");
		capitals.put("Japan "," Tokyo");
		capitals.put("Canada " ," Ottawa");
		capitals.put("India " , " Kolkata");
		System.out.println("Is Contain Key India? " + capitals.containsKey("India "));
		if(capitals.containsKey("India "))
			System.out.println("Yes it's contains Key India");
		else
			System.out.println("No it's not contains Key India");
		System.out.println("Is Contain Value Tokyo? " + capitals.containsValue(" Tokyo"));
		if(capitals.containsValue(" Tokyo"))
			System.out.println("Yes it's contains Value Tokyo");
		else
			System.out.println("No it's not contains Value Tokyo");
	}
}