package main.java.com.ipstaurus.attmng.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * author: Jin Hyeyoung
 *
 */

@Controller
public class AttMngHelloWorld {

	/*@RequestMapping("/login")
	public ModelAndView joinpage() {
		return new ModelAndView("login");
	}*/

	@RequestMapping("/login")
	public ModelAndView loginpage() {
		return new ModelAndView("login");
	}

	@RequestMapping("/main")
	public ModelAndView mainpage() {
		return new ModelAndView("main");
	}

	/*@RequestMapping("/update")
	public ModelAndView updatepage() {
		return new ModelAndView("update");
	}

	@RequestMapping("/user_view")
	public ModelAndView user_viewpage() {
		return new ModelAndView("user_view");
	}*/

}
