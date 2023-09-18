package com.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("com/hibernate/Cong2.xml");
		SessionFactory factory = con.buildSessionFactory();
		
		Studnets1 st = new Studnets1();
		st.setId(101);
		st.setName("Abubakar");
		st.setGen("Male");
		System.out.println(st);
		
		Address address = new Address();
		address.setCityName("SantKabir Nagar");
		address.setStateName("UP");
		address.setOpen(false);
		address.setAddeDate(new Date());
		
		 Session session=factory.openSession();
		Transaction tr = session.beginTransaction();
		
		Configuration con1 = new Configuration();
		con.configure("com/hibernate/Cong2.xml");
		SessionFactory factory1 = con.buildSessionFactory();
		Certificate  certificate=new Certificate();
		certificate.setCourseDuration("java");
		certificate.setCourseDuration("2 years");
		System.out.println(certificate);
		Session sess=factory1.openSession();
		 Transaction transaction=sess.beginTransaction();
		 session.persist(address);
		session.persist(st);
		
		 
		transaction.commit();
		sess.close();
	}
}
