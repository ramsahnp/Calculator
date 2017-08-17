package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

public class SelectServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		int id=Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		Employee e=(Employee)s.get(Employee.class, id);
		out.println(e.getEid());
		out.println(e.getEname());
		out.println(e.getEsal());
		
		
	}

}
