public class Marks{

	static class Student{

		public double[] marks;

		public Student(double[] marks){
			this.marks = marks;
		}

		public double avg(){
			double sum = 0;
			for(double mark : marks){
				sum += mark;
			}
			return sum/marks.length;
		}
	}

	static class SportsStudent extends Student{
	
		public double sportsScore;
	
		public SportsStudent(double[] marks,double sportsScore){
			super(marks);
			this.sportsScore = sportsScore;
		}

		@Override
		public double avg(){
			double academicAvg = super.avg();
			return (academicAvg + sportsScore)/2.0;
		}
	}

	public static void main(String[] args){

		double[] academicMarks = {85.5,78.0,92.0};
		
		Student s = new Student(academicMarks);
		System.out.printf("Academic Average: %.2f\n", s.avg());
		
					
		SportsStudent sp = new SportsStudent(academicMarks,88.0);
		System.out.printf("Sports Student Average(Academic + Sports): %.2f" , sp.avg());
	}
}	
			