public class FallThrough{
	public static void main(String[] args){
		int month = 4;
		switch(month)
		{
			case 3:
			case 4:
			case 5:
				System.out.println("Spring Season");
				break;
			default:
				System.out.println("Not Spring");
		}
	}
}