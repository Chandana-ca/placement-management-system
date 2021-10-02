package college1.Service;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import college1.College;
import college1.repo.CollegeRepo;

public class CollegeService extends HttpServlet {
	   private CollegeRepo sr;
public void init(ServletConfig config) throws ServletException {	
        sr = new CollegeRepo();		
}
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		try 
		  {
			switch (action)
			{
				case"/add":
					addcollege(request,response);
				case"/insert":
				    insertcollege(request,response);		
				case"/update":
					updatecollege(request,response);
				case"/edit":
					editcollege(request,response);	
				case"/delete":
					deletecollege(request,response);
				default:
					displaycollege(request,response);		
			}
		  }
		catch(Exception e)
		{
			System.out.println(e);
	    }
	}
private void editcollege(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int id=Integer.parseInt(request.getParameter("id"));
	College s = sr.getCollege(id);
	request.setAttribute("s",s);
	RequestDispatcher rd = request.getRequestDispatcher("edit_form.jsp");
	rd.forward(request,response);	
}
private void insertcollege(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	College s = new College();
	s.setId(Integer.parseInt(request.getParameter("id")));
	s.setSname(request.getParameter("sname"));
	s.setCname(request.getParameter("cname"));
	s.setLocation(request.getParameter("location"));
	sr.addcollege(s);
	List<College> list = sr.getCollege();
	request.setAttribute("list",list);
	RequestDispatcher rd = request.getRequestDispatcher("College_list1.jsp");
	rd.forward(request,response);
}
private void displaycollege(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	List<College> list = sr.getCollege();
	request.setAttribute("list",list);
	RequestDispatcher rd = request.getRequestDispatcher("College_list1.jsp");
	rd.forward(request,response);
  }
private void deletecollege(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int id=Integer.parseInt(request.getParameter("id"));
	College s = sr.getCollege(id);
	sr.deletecollege(s);
	List<College> list = sr.getCollege();
	request.setAttribute("list",list);
	RequestDispatcher rd = request.getRequestDispatcher("College_list1.jsp");
	rd.forward(request,response);
  }
private void updatecollege(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	College s = new College();
	s.setId(Integer.parseInt(request.getParameter("id")));
	s.setSname(request.getParameter("sname"));
	s.setCname(request.getParameter("cname"));
	s.setLocation(request.getParameter("location"));
	sr.updatecollege(s);
	List<College> list = sr.getCollege();
	request.setAttribute("list",list);
	RequestDispatcher rd = request.getRequestDispatcher("College_list1.jsp");
	rd.forward(request,response);
  }
private void addcollege(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	RequestDispatcher rd = request.getRequestDispatcher("new_form.jsp");
	rd.forward(request,response);
	}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
  }
}
