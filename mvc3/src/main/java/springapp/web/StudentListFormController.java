package springapp.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import springapp.service.StudentManager;

@Controller
@RequestMapping("/student")
public class StudentListFormController {
    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private StudentManager studentManager;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView getStudentList()
            throws ServletException, IOException {

    	logger.info("Displaying Student list...");
        Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("studentList", this.studentManager.getStudentList());
        return new ModelAndView("studentlist", "model", myModel);
    }

}
