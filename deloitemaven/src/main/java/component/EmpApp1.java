package component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpApp1 {

	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("com.xml");
		Employee emp = (Employee) apc.getBean("employee");
		System.out.println(emp.getCode() + " "+ emp.getName() + " " + emp.getSalary().getBasicpay());
	}

}
