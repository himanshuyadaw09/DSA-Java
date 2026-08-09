import java.util.ArrayList;
public class ArrayList5{
	public static void main(String[] args){
		ArrayList<Integer> integers = new ArrayList<>();
		integers.add(3);
		integers.add(5);
		integers.add(8);
		integers.add(30);
		integers.add(20);
		int n = integers.size();
		for(int i=0; i<n; i++){
			System.out.println(integers.get(i));
		}
	}
}
