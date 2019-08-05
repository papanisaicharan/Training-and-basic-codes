package inheritance;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hbcore.Employee2;

public class BookApp {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session ssn = factory.openSession();
		
		Book book = new Book();
		book.setBookId(123);
		book.setAuthor("saicharan");
		book.setTitle("na savu nenu sasta neku endhuku");
		book.setPrice(1000000);
		
		JavaBook javabook = new JavaBook();
		javabook.setBookId(124);
		javabook.setAuthor("varun");
		javabook.setTitle("na savu nenu sasta neku endhuku part-2");
		javabook.setPrice(1000000);
		javabook.setDiscount(20);
		
		DotNetBook dotnetbook = new DotNetBook();
		dotnetbook.setBookId(125);
		dotnetbook.setAuthor("saicharan");
		dotnetbook.setTitle("na savu nenu sasta neku endhuku part-3");
		dotnetbook.setPrice(1000000);
		dotnetbook.setCds(2);
		Transaction tx = ssn.beginTransaction();
		ssn.save(book);
		ssn.save(javabook);
		ssn.save(dotnetbook);
		tx.commit();
		Query qry = ssn.createQuery("from Book");
		List<Book> empls =  qry.list();
		for(Book e : empls) {
			System.out.println(e.getAuthor() + " " + e.getBookId() +" " + e.getTitle() );
		}
		ssn.close();
		System.out.println("success");
	}

}
