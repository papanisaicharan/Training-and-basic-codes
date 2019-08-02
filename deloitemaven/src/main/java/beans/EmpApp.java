package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import component.Employee;

public class EmpApp {

	private static ApplicationContext apc;

	public static void main(String[] args) {
	// prototype
	apc = new ClassPathXmlApplicationContext("Spring.xml");
	Employee emp = (Employee) apc.getBean("emp");
	Employee emp1 = (Employee) apc.getBean("emp");
	emp.setCode(123);
	emp.setName("deloitte");
	System.out.println(emp.getCode() + "  " + emp.getName());
	System.out.println(emp1.getCode() + "  " + emp1.getName());
	
	//singleton scope
	Student std = (Student) apc.getBean("student");
	System.out.println(std.getAvg() + "   "+ std.getRegno() + std.getStdname());
	Student std1 = (Student) apc.getBean("student");
	System.out.println(std1.getAvg() + "   "+ std1.getRegno() + std1.getStdname());
	
	Customer ct = (Customer) apc.getBean("cust");
	System.out.println(ct.getId() + " " + ct.getName()  + " " + ct.getAddr().getCity() +" "+ ct.getAddr().getStreet());
	}

}
