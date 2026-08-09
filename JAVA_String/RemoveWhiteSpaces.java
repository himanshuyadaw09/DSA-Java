public class RemoveWhiteSpaces{
	public static String req(String ip){
		String res = "";
		int i, n = ip.length();
		for ( i = 0; i < n; i++){
			if( ip.charAt(i) != ' ' ){
				res += ip.charAt(i);
			}
		}
		return res;
	}

	public static void main(String[] args){
		String str = " Himanshu   Yadav      ji";
		System.out.println(req(str));
	}
}