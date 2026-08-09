class Marks2{

	static class Student{
		
		public double[] academicMarks;
		
		public Student(double[] marks){
			this.academicMarks = marks;
		}

		public double avg(){
			double sum = 0;
			for(double i : academicMarks){
				sum += i;
			}
			return sum/academicMarks.length;
		}
}

	static class SportsStudent extends Student{
	
		public double sportsMarks;
	
		public SportsStudent(double[] academicMarks,double sportsMarks){
			super(academicMarks);
			this.sportsMarks = sportsMarks;
		}

		@Override
		public double avg(){
			double academicAvg = super.avg();
			return (academicAvg + sportsMarks)/2.0;
		}
}
	public static void main(String[] args){
		double[] marks = {85.5,78.0,92.0};
		Student s = new Student(marks);
		SportsStudent sport = new SportsStudent(marks,88.0);
		System.out.printf("Academic Average: %.2f\n", s.avg());
		System.out.printf("Average of Academic marks avg and sports marks avg: %.2f\n" , sport.avg());
	}
}