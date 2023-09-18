package oneTomanyPa;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration con = new Configuration();
		con.configure("oneTomanyPa/Cong2.xml");
		SessionFactory factory = con.buildSessionFactory();
		Question question = new Question();
		question.setId(12);
		question.setQuestion("what is java");
		Answer answer = new Answer();
		answer.setId(131);
		answer.setAnswer("java is a programming language");
		answer.setQuestion(question);
		List <Answer>list = new ArrayList<>();
		list.add(answer);
      question.setAnswers(list);
      Session session=factory.openSession();
      Transaction txTransaction=session.beginTransaction();
      session.persist(answer);
      session.persist(question);
      session.persist(list);
      
      
      txTransaction.commit();
      session.close();
    	factory.close();

	}

}
