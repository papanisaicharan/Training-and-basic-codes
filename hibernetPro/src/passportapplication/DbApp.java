package passportapplication;

import java.util.Calendar;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class DbApp {

	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session ssn = factory.openSession();
		Transaction tx = ssn.beginTransaction();
		
		Applicant applicant = new Applicant();
		applicant.setAge(20);
		applicant.setCity("hyderabad");
		applicant.setName("saicharan");
		
		Passport passport = new Passport();
		passport.setPassportNumber("ARBJJ1233");
		passport.setIssueDate(new Date());
		Calendar expiryDate  = Calendar.getInstance();
		expiryDate.setTime(new Date());
		expiryDate.add(Calendar.YEAR, 10);
		passport.setExpiryDate(expiryDate.getTime());
		
		//relation
		applicant.setPassport(passport);
		passport.setApplicant(applicant);
		ssn.save(applicant);
		tx.commit();
		ssn.close();
		System.out.println("success");
		
	}

}
