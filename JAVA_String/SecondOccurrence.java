public class SecondOccurrence{
	public static void main(String[] args){
		String str = "Programming";
		char ch = 'g';
		
		int firstIndex = str.indexOf(ch);
		int secondIndex = str.indexOf(ch,firstIndex + 1);
		System.out.printf("Second Occurrence of %c is at : %d\n",ch,secondIndex);


		String s = "Adiatya";
		String[] st = s.split("a");
		int ans = st[0].length() + st[1].length()+1;
		System.out.printf("Second Occurrence of 'a' is : %d\n",ans);

		String ss = "adityyyajain";
		String[] sst = ss.split("a");
	
		int first = ss.indexOf("a");
		System.out.println(first);

		String remaining = ss.substring(first + 1);
		System.out.println(remaining);
	
		int ans2 = (first + 1) + remaining.indexOf("a");
		System.out.println(ans2);
	}
} 