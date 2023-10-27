
import java.util.Scanner;

public class Employee  implements Comparable<Employee>{
	int empid;
	String name;
	double salary;
	public Employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	
	void accept(Scanner sc) {
	System.out.println("Enter employee id :");
	this.empid=sc.nextInt();
	
	System.out.println("Enter employee name :");
	this.name=sc.nextLine();
	
	System.out.println("Enter employee salary :");
	this.salary=sc.nextDouble();
	}
	@Override
	public int compareTo(Employee o) { 
		int diff=Double.compare(salary, o.salary);
		return diff;
		
	}

	
}
