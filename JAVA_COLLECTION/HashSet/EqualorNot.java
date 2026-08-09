import java.util.*;
public class EqualorNot{
	public static boolean isSubset(HashSet<Integer> a, HashSet<Integer> b){
		for(int i: a){
			if(!b.contains(i))
				return false;
		}
		return true;
	}

	public static void main(String[] args){
	
	HashSet<Integer> hs1 = new HashSet<>();
	hs1.add(3);
	hs1.add(4);
	hs1.add(9);
	hs1.add(10);

	HashSet<Integer> hs2 = new HashSet<>();
	hs2.add(4);
	hs2.add(2);
	hs2.add(3);
	hs2.add(9);

	if(isSubset(hs1,hs2) && isSubset(hs2,hs1))
		System.out.println("Equal");
	else
		System.out.println("Not Equal");
	}
}