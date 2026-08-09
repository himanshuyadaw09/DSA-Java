class Employee{

	public double baseSalary;
	
	public Employee(double baseSalary){
		this.baseSalary = baseSalary;
	}

	public double getSalary(){
		return baseSalary;
	}
}

class Manager extends Employee{

	public Manager(double baseSalary){
		super(baseSalary);
	}

	@Override 
	public double getSalary(){
		return super.getSalary()*1.10;
	}
}

public class Abstraction3{
	public static void main(String[] args){
		Employee emp = new Employee(50000);
		Manager mgr = new Manager(50000);
		System.out.printf("Employee Salary: %.3f\n", emp.getSalary());
		System.out.printf("Manager Salary: %.3f", mgr.getSalary());
	}
}