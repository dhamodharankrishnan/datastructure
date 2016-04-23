package springapp.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import tree.tab.ITabConstants;
import tree.tab.TabCollection;

public class MultiLevelTabFormController implements Controller {
	
    protected final Log logger = LogFactory.getLog(getClass());

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	TabCollection tabColl = new TabCollection(ITabConstants.TAB_ARRAY);
    	tabColl.setSelected("b.3.2.2");
    	ArrayList multiLevelTabList = tabColl.getMultiLevelList();
    	Map<String, Object> myModel = new HashMap<String, Object>();
    	myModel.put("mulTabList", multiLevelTabList);
    	return new ModelAndView("mtab", "model", myModel);
    }

}
