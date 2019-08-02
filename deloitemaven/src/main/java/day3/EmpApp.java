package day3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class EmpApp {
	private static ApplicationContext apc;
	public static void main(String[] args) {
		// prototype
		apc = new ClassPathXmlApplicationContext("Spring.xml");
		Employee emp = (Employee) apc.getBean("emp1");
		System.out.println(emp.getCode() + " " + emp.getName());
		for(String s: emp.getSkills()) {
			System.out.println(s);
		}
	}

}
