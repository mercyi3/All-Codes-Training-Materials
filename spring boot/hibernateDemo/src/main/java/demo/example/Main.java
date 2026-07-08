package demo.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
//		Student std = new Student();
//		
//		std.setSid(102);
//		std.setSname("Robin");
//		std.setTech("Java FS");
		
		Configuration config = new Configuration();
		config.addAnnotatedClass(demo.example.Student.class);
		config.configure("hibernate.cfg.xml");
		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
//		Transaction transaction = session.beginTransaction(); // for save, update delete
//		
//		session.persist(std);
//		transaction.commit();
		
//		Student std = session.find(Student.class, 102); //read data
//		System.out.println(std);
		
		session.close();
		factory.close();
	}

}
