package com.oneMap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("com/hibernate/Cong2.xml");
		SessionFactory factory = con.buildSessionFactory();
		Question q=new Question();
		q.setQuesId(12);
		q.setQues("What is programming ?");
		
		Answer ans=new Answer();
		ans.setAnsId(120);
		ans.setAnswer(" programming a languge .");
		q.setAnswer(ans);
		Question q1=new Question();
		q1.setQuesId(13);
		q1.setQues("What is java?");
		
		Answer ans1=new Answer();
		ans.setAnsId(121);
		ans.setAnswer(" programming a languge .");
		q1.setAnswer(ans1);
		
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		session.persist(q);
		session.persist(ans);
		session.persist(ans1);
		session.persist(q1);
		tr.commit();
		session.close();
		factory.close();
		
	}

}
