package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

public class InsertServlet extends HttpServlet 
{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		PrintWriter out=resp.getWriter();
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		int sal=Integer.parseInt(req.getParameter("sal"));
		SessionFactory f=HibernateUtil.getSessionFactory();
		Session s=f.openSession();
		org.hibernate.Transaction tx=s.beginTransaction();
		Employee e=new Employee(id,sal,name);
		
		s.save(e);
		
			tx.commit();
		
		
		
		try {
			out.println("Successfully Inserted....");
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		req.getRequestDispatcher("index.html").forward(req, resp);
		s.close();
		f.close();
		
	}
	

}
