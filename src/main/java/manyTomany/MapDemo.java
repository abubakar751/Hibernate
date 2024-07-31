package manyTomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("com/hibernate/Cong.xml");
		SessionFactory factory = con.buildSessionFactory();
		
		Emp emp= new Emp();
		emp.setEid(101);
		emp.setEname("Abu Bakar");
		
		Emp emp2 = new Emp();
		emp2.setEid(102);
		emp2.setEname("Abrar");
		
		
		Project p1 = new Project();
		p1.setPid(201);
		p1.setPname("Hibernate");
		
		Project p2 = new Project();
		p2.setPid(202);
		p2.setPname("Servlate");
		
		List<Emp> list1=new ArrayList<Emp>();
		List<Project> list2=new ArrayList<Project>();
		
		list1.add(emp);
		list1.add(emp2);
		list2.add(p1);
		list2.add(p2);
		
		emp.setProject(list2);
		p2.setEmp(list1);
		
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.persist(emp);
		session.persist(emp2);
		session.persist(p1);
		session.persist(p2);
		transaction.commit();
		session.close();
		factory.close();
	}

}
