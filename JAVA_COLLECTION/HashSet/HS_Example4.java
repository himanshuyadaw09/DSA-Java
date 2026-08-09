import java.util.HashSet;
public class HS_Example4{
	public static void main(String[] args){
		HashSet<String> products = new HashSet<>();
		products.add("Moniter");
		products.add("CPU");
		products.add("Mouse");
		products.add("MotherBoard");
		products.add("Keyboard");
		
		for(String product : products)
			System.out.println(product);
		System.out.println("Size of HashSet: " + products.size());
		products.clear();
		System.out.println("After clear HashSet: " + products);
	}
}