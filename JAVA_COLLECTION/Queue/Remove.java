import java.util.*;
public class Remove{
	public static void main(String[] args){

		Queue<String> products = new LinkedList<>();

		products.offer("Fan");
		products.offer("Laptop");
		products.offer("Study Table");
		products.offer("Bed");

		System.out.println("Products: " + products);

		System.out.println("Removed Product: " + products.poll());
		
		System.out.println("Final Products: " + products);
	}
}