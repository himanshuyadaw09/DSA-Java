public class ContinueWhile2{
	public static void main(String[] args){
		int j = 0;
		while(j<5){
			if(j==3)
				continue;
			j++;
			System.out.println(j);
		}
	}
}