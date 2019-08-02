package hdmcustomer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class CstomerApp {

	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session ssn = factory.openSession();
		Customer ct = new Customer();
		ct.setCustname("saicharan");
		Transaction tx = ssn.beginTransaction();
		ssn.save(ct);
		tx.commit();
		ssn.close();
		System.out.println("success");
	}

}
