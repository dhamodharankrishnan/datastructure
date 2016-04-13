package springapp.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import springapp.service.StudentManager;

public class StudentListFormController implements Controller {
    protected final Log logger = LogFactory.getLog(getClass());
	private StudentManager studentManager;

    public void setStudentManager(StudentManager studentManager) {
        this.studentManager = studentManager;
    }

    public ModelAndView handleRequest(HttpServletRequest request, 
    		 HttpServletResponse response)
            throws ServletException, IOException {

    	logger.info("Displaying Student list...");
        Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("studentList", this.studentManager.getStudentList());
        return new ModelAndView("studentlist", "model", myModel);
    }

}
