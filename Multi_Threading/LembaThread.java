public class LembaThread{
	public static void main(String[] args){
		Thread t = new Thread(() -> {
		System.out.println("Tread using Lemba");
		});
		t.start();
	}
}