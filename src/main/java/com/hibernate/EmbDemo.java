package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbDemo {
	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("com/hibernate/Cong2.xml");
		SessionFactory factory = con.buildSessionFactory();
		Studnets1 studnets1 = new Studnets1();
		studnets1.setId(102);
		studnets1.setName("As");
		studnets1.setGen("Male");
		Certificate certificate = new Certificate();
		certificate.setCourse("Java");
		certificate.setCourseDuration("2 Years");
		studnets1.setCerti(certificate);
		Session sn=factory.openSession();
		Transaction tt=sn.beginTransaction();
		sn.persist(studnets1);
		tt.commit();
 		factory.close();
	}
}
