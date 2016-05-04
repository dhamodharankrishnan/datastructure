package sampleweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ExtendServlet extends GenericServlet {

	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		String initParam = config.getInitParameter("first-init-param");
		System.out.println("Init Parameter:"+initParam);
	}

	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>");
		out.println("First servlet output111....title");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>My First Servlet output...</h1>");
		
		List<String> studentNameList = new ArrayList<String>();
		studentNameList.add("Naveen");
		studentNameList.add("Karthik");
		studentNameList.add("Dhamo");

		out.println("<table border=\"1\">");
		Iterator<String> studIter = studentNameList.iterator();
		while(studIter.hasNext()){
			out.println("<TR>");
			out.println("<TD>");
			out.println(studIter.next());
			out.println("</TD>");
			out.println("</TR>");
		}
		out.println("</table>");
		
		out.println("</body>");
		out.println("</html>");	 
	}

}
