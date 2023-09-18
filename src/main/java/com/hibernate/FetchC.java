package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchC {

	public static void main(String[] args) {
		Configuration con1=new Configuration();
		con1.configure("com/hibernate/Cong2.xml");
		SessionFactory sessio=con1.buildSessionFactory();
		Session session=sessio.openSession();
	Studnets1 studnets1=session.get(Studnets1.class, 101);
	//System.out.println(studnets1);
	
	Address address=session.get(Address.class,1);
	System.out.println(address.getAddressId()+" "+address.getStateName());
	session.close();
	sessio.close();
	
		
		

	}

}
