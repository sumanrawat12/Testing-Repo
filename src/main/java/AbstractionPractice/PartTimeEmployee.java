package AbstractionPractice;

import java.util.Scanner;

public class PartTimeEmployee extends Employee {
	public int PartEmployeehour;
	
	public PartTimeEmployee(String employeeName, int salary,int payment) {
			
		super(employeeName, salary);
	
		this.PartEmployeehour = PartEmployeehour;
	}

	@Override
	public int caluclateSal()
	{

				return getSalary()*PartEmployeehour;
	}

}
