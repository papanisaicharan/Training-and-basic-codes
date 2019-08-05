package springhb;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeAppIn {
	
	public static void main(String args[]) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("springhb/springhbn.xml");
		HibernetDao dao =  ac.getBean("hbnDao",HibernetDao.class);
		Employee2 emp =  ac.getBean("employee2",Employee2.class);
		List<Employee2> empls = dao.getEmployees();
		for(Employee2 emp1  : empls) {
			System.out.println(emp1);
		}
		System.out.println("done");
		Scanner s = new Scanner(System.in);
		System.out.println("enter a employee code to delete");
		int empcode = s.nextInt();
		Employee2 emp1 = dao.getById(empcode);
		dao.deleteEmployeeE(emp1);
		System.out.println("deleted");
		System.out.println("enter a employee code,empname,salary to update");
		int empcode1 = s.nextInt();
		String empname1 = s.next();
		int sal = s.nextInt();
		Employee2 emp2 = new Employee2();
		emp2.setEmpcode(empcode1);
		emp2.setEmpname(empname1);
		emp2.setSalary(sal);
		dao.updateEmployee(emp2);
		System.out.println("updated");
	}
}
