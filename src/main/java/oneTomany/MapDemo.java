package oneTomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("com/hibernate/Cong2.xml");
		SessionFactory factory = con.buildSessionFactory(); 
		
		Question2 question=new Question2();
		question.setQuesId(10);
		question.setQuestion("What is Java ");
		
		
		
		Answer1 answer1=new Answer1();
		answer1.setAnsId(19);
		answer1.setAns(" java is a language");
		answer1.setQuestion2(question);
		
		
		List<Answer1> list= new ArrayList<Answer1>();
		list.add(answer1);
		
		
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.persist(question);
		session.persist(answer1);
		session.persist(list);
	
		transaction.commit();
		session.close();
		factory.close(); 
		
	}

}
