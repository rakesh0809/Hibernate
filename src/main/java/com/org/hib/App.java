package com.org.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		System.out.println("Hello World!");
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory fact = cfg.buildSessionFactory();
		Session sess = fact.openSession();
		sess.beginTransaction();
		Book1 book = new Book1();

		book.setBno(401);

		book.setBname("Java Complete Reference");

		book.setPrice(550);

		sess.save(book);

		sess.getTransaction().commit();

		System.out.println("saved successfully ");

		sess.close();

	}
}
