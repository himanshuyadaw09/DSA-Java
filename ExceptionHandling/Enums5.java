enum Animal{
	DOG,CAT,RABBIT;

	@Override
	public String toString(){
		String ans = name() + " --> " + name().toLowerCase();
		return ans;
	}
}

public class Enums5{
	public static void main(String[] args){
		System.out.println(Animal.RABBIT);
	}
}