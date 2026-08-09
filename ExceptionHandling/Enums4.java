public class Enums4{
	enum Planet{
		EARTH(1),MARS(2),VENUS(3);
		private final int position;
		Planet(int position){
			this.position = position;
		}
		public int getPosition(){
			return position;
		}
	}
	public static void main(String[] args){
		System.out.println("Mars is planet #" + Planet.MARS.getPosition());
	}
}