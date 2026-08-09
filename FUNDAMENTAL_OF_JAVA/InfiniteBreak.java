public class InfiniteBreak{
	public static void main(String[] args){
		int count = 0;
		while(true){
			if(count == 3)
				break;
			System.out.println("Count: " + count );
			count++;
		}
	}
}