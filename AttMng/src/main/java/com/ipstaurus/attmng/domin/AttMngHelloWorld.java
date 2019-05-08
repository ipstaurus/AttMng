package main.java.com.ipstaurus.attmng.domin;

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
}
