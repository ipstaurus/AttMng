package main.java.com.ipstaurus.attmng.domain;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/*
 * author: Jin Hyeyoung
 *
 */

@Controller
public class AttMngHelloWorld {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {

		String message = "<br><div style='text-align:center;'>"
				+ "<h3>IPSTAURUS - Attendance Management</h3></div>";
		return new ModelAndView("welcome", "message", message);
	}
	
	  @RequestMapping("/login") public ModelAndView joinpage() {	  
	  return new ModelAndView("login"); 
	  }
	  
	  @RequestMapping("/main") public ModelAndView mainpage() {	  
		  return new ModelAndView("main"); 
		  }

}
