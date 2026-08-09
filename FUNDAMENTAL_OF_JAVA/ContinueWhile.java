public class ContinueWhile{
	public static void main(String[] args){
		int j = 0;
		while( j<5 ){
			j++;
			if( j == 3 )
				continue;
			System.out.println(j);
		}
	}
}