enum TrafficLight{
	RED, GREEN, YELLOW;
}
public class Enums8{
	public static void main(String[] args){
		TrafficLight l = TrafficLight.RED;
		switch(l){
			case RED:
				System.out.println("STOP!");
				break;
			case GREEN:
				System.out.println("GO GO!");
				break;
			case YELLOW:
				System.out.println("WAIT !");
				break;
		}
	}
}