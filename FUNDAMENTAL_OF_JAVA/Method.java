public class Method{
	public int mul(int a){
		return a*a;
	}
	public int square(int a){
		Method obj_1 = new Method();
		return obj_1.mul(a);
	}
	public static void main(String[] args){
		Method obj_2 = new Method();
		int x = 5;
		int res = obj_2.square(x);
		System.out.println("Square of " + x + " is " + res);
	}
}
		