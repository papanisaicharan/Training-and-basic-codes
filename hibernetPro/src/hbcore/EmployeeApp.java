package hbcore;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeApp {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session ssn = factory.openSession();
		Employee2 emp = new Employee2();
		emp.setEmpcode(125);
		emp.setEmpname("saicharan1");
		emp.setSalary(10);
		Transaction tx = ssn.beginTransaction();
		ssn.save(emp);
		tx.commit();
		ssn.close();
		System.out.println("success");
	}
}
