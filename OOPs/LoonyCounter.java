public class LoonyCounter{

	// Static variable to count objects
	private static int count = 0;
	// Instance variable
	private String id;
	// Constructor increments count and sets id
	public LoonyCounter(String id){
		this.id = id;
		count++;
	}
	public static int getCount(){
		return count;
	}
	public void showInfo(){
		System.out.println("Object " + id + " created");
	}
	public static void main(String[] args){
		LoonyCounter a = new LoonyCounter("A1");
		LoonyCounter b = new LoonyCounter("B1");
		a.showInfo();
		b.showInfo();
		System.out.println("Total objects: " + LoonyCounter.getCount());
	}
}