package AbstractionPractice;

public abstract class Employee {
					 private String employeeName;
					 private int salary;
	 
					public Employee(String employeeName,int salary)
					{
					this.employeeName = employeeName;
					this.salary = salary; 
					
					System.out.println(employeeName);
					System.out.println(salary);
					}
					
					public abstract int caluclateSal();
	

//Setting Setter and Getter

public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}

}
