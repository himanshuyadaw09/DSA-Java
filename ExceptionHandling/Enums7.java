public class Enums7{
	enum Month{
		JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC;
	}
	
	public static void main(String[] args){
		for(Month m: Month.values()){
			System.out.println(m.name() + " -> " + (m.ordinal()+1));
		}
	}
}