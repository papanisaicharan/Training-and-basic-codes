package hbcore;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateEmployee {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session ssn = factory.openSession();
		Employee2 emp = (Employee2) ssn.get(Employee2.class,122 );
		emp.setEmpname("charan");
		emp.setSalary(10000);
		Transaction tx = ssn.beginTransaction();
		ssn.update(emp);
		Employee2 emp1 = (Employee2) ssn.get(Employee2.class,125 );
		ssn.delete(emp1);
		tx.commit();
		Query qry = ssn.createQuery("from Employee2");
		List<Employee2> empls =  qry.list();
		for(Employee2 e : empls) {
			System.out.println(e.getEmpcode() + " " + e.getEmpname() +" " + e.getSalary() );
		}
		ssn.close();
	}

}
