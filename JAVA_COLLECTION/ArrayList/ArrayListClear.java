import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListClear{
	public static void main(String[] args){
		String[] cityNames = { "Mumbai","Tokyo","Delhi","Kolkata","Siwan","Patna"};
		ArrayList<String> cities = new ArrayList<>(Arrays.asList(cityNames));
		cities.clear();
		System.out.println("ArrayList after clear : " + cities);

	}
}