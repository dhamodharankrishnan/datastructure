package sampleweb.servlet;

import java.io.IOException;	
import java.util.ArrayList;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class StudentServlet extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		
		String userName = (String) request.getParameter("txtName");
		String place = (String) request.getParameter("txtPlace");
		
		System.out.println("userName :"+userName);
		System.out.println("place :"+place);
		
		List<String> studentNameList = new ArrayList<String>();
		studentNameList.add("Naveen");
		studentNameList.add("Karthik");
		studentNameList.add("Dhamo");
		
		request.setAttribute("studentList", studentNameList);

		RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/studentinfo.jsp");
		requestDispatcher.forward(request, response);
	}

}
