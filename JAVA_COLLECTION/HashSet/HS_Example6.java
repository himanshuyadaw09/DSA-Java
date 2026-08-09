import java.util.*;
public class HS_Example6{
	public static void main(String[] args){
		ArrayList<String> products = new ArrayList<>();

		products.add("Fan");
		products.add("Mosqito Nets");
		products.add("Soap");
		products.add("Detergent");
		products.add("Salt");

		HashSet<String> all_products = new HashSet<>(products);
	
		HashSet<String> defective = new HashSet<>();
		defective.add("Salt");

		HashSet<String> non_defective = new HashSet<>();

		for(String pro : all_products)
		{
			if(!defective.contains(pro))
				non_defective.add(pro);
		}
		System.out.println("All Products: " + all_products);
		System.out.println("Defected Products: " + defective);
		System.out.println("Non_Defected Products: " + non_defective);
	
		// Method 2  -> difference of set : A-B
		// A.removeAll(B)-> A=A-B

		HashSet<String> temp = new HashSet<>();
		for(String product : products){
			temp.add(product);
		}

		all_products.removeAll(defective);
		System.out.println("All Products: " + temp);
		System.out.println("Non Defective Products: " + all_products);
	}
}
		