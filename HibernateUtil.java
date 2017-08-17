package pack1;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil 
{
	private static SessionFactory factory;
	public static SessionFactory getSessionFactory()
	{
		if(factory==null)
		{
			factory=new Configuration().configure("res/hibernate.cfg.xml").buildSessionFactory();
		}
		return factory;
	}

}
