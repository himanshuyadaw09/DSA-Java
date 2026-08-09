public class DefaultOnly1{
	public static void main(String[] args){
		int number = 99;
		switch(number)
		{
			default:
				System.out.println("No Matching Case");
			case 99:
				System.out.println("99");
		}
	}
}