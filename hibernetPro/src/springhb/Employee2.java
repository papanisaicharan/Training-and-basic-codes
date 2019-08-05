package springhb;

public class Employee2 {
	private int empcode;
	private String empname;
	private int salary;
	public int getEmpcode() {
		return empcode;
	}
	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee2 [empcode=" + empcode + ", empname=" + empname + ", salary=" + salary + "]";
	}
	
}
