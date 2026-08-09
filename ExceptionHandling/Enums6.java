
public class Enums6{
enum Month{
	JAN(1),FEB(2),MAR(3),APRIL(4),MAY(5),JUN(6),
	JULY(7),AUG(8),SEP(9),OCT(10),NOV(11),DEC(12);

	private final int position;

	Month(int position){
		this.position = position;
	}

	public static int getPosition(){
		return position;
	}
}

	public static void main(String[] args){
		for(Month month: Month.values()){
		System.out.println(Month.name() + " -> " + Month.getPosition());
		}
	}
}