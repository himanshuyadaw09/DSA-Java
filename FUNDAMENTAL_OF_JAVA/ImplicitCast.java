/*
	Type casting:- 1)implicit casting(smaller to larger)ex: int to double
		       2)explicit casting(larger to smaller)ex: double to int
	Dataloss: in explicit type casting may have data loss 
*/
public class ImplicitCast{
	public static void main(String[] args){
		/*int myInt = 40;
		double myDouble = myInt;  //automatic
		System.out.println(myDouble);
		*/
		// Explicit typecasting
		double myDouble = 4.64;
		int myInt = (int)myDouble;  // Mannually
		System.out.println(myInt);
	}
} 