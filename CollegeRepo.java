package college1.repo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import college1.College;

import org.hibernate.Transaction;
	
public class CollegeRepo {
	private SessionFactory sf;
	public SessionFactory getsessionfactory()
	{
		Configuration con = new Configuration().
				            configure().  
				            addAnnotatedClass(College.class);
		sf=con.buildSessionFactory();
		return sf;	
	} 
	public void addcollege(College s)
	{
		sf=getsessionfactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(s);
		tx.commit();
	}
	public List<College> getCollege() {
		Session session = getsessionfactory().openSession();
		Transaction tx = session.beginTransaction();
		List<College>list = session.createQuery("from College").getResultList();
		tx.commit();
		return list;
	}
	public College getCollege(int id) {
		Session session = getsessionfactory().openSession();
		Transaction tx = session.beginTransaction();
		College s = session.get(College.class, id);
		tx.commit();
		return s;
	}
	public void updatecollege(College s) {
		sf=getsessionfactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(s);
		tx.commit();		
	}
	public void deletecollege(College s) {
		sf=getsessionfactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(s);
		tx.commit();		
	}		
}
