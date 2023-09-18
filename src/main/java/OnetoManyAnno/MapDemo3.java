package OnetoManyAnno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo3 {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("OnetoManyAnno/Cong3.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		
		Question3 question3=new Question3();
		question3.setId(10);
		question3.setQuesName(" What is Keyword  ");
		
		
		Answer3 answer3=new Answer3();
		answer3.setAnswerId(20);
		answer3.setAnswer(" Keyword Is  Reserve Word");
		answer3.setQuestion3(question3);
		
		Answer3 answer4=new Answer3();
		answer4.setAnswerId(4);
		answer4.setAnswer("That cann't use Every whare ");
		answer4.setQuestion3(question3);
		List<Answer3> list=Arrays.asList(answer3,answer4);
		
		question3.setAnswer(list);
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		session.persist(question3);
		session.persist(answer3);
		session.persist(answer4);
		
		tx.commit();
		session.close();
	}

}
