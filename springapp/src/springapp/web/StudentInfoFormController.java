package springapp.web;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.servlet.view.RedirectView;

import springapp.service.StudentInfo;
import springapp.service.StudentManager;

public class StudentInfoFormController extends SimpleFormController {

    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());

    private StudentManager studentManager;

	public void setStudentManager(StudentManager studentManager) {
		this.studentManager = studentManager;
	}

    public ModelAndView onSubmit(Object command)
            throws ServletException {

        StudentInfo studInfo = ((StudentInfo) command);
		logger.info("Saving student: "+studInfo);
		
		studentManager.saveStudentInfo(studInfo);

        return new ModelAndView(new RedirectView(getSuccessView()));
        
    }

	@SuppressWarnings("rawtypes")
	protected Map referenceData(HttpServletRequest request) throws Exception {
    	Map referenceData = new HashMap();
    	Map<String,String> countryMap = new LinkedHashMap<String,String>();
    	countryMap.put("US", "United Stated");
    	countryMap.put("CHINA", "China");
    	countryMap.put("SG", "Singapore");
    	countryMap.put("MY", "Malaysia");
    	referenceData.put("countryMap", countryMap);
    	
    	Map<String, String> gradeMap = new LinkedHashMap<String, String>();
    	gradeMap.put("UG", "Under-Graduate");
    	gradeMap.put("PG", "Post-Graduate");
    	referenceData.put("gradeMap", gradeMap);
    	
    	return referenceData;
    	
	}
    
}
