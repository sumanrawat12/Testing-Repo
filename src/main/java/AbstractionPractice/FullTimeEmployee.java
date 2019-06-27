package AbstractionPractice;

public class FullTimeEmployee extends Employee{

	public FullTimeEmployee(String employeeName, int salary) {
		super(employeeName, salary);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int caluclateSal()
	{
		return getSalary()*8;
	}

}