package main.java.com.ipstaurus.attmng.controller;

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

	//ログイン画面
	@RequestMapping("/login")
	public ModelAndView loginpage() {
		return new ModelAndView("login");
	}

	//メイン画面
	@RequestMapping("/main")
	public ModelAndView mainpage() {
		return new ModelAndView("main");
	}

	//会員登録画面
	@RequestMapping("/join")
	public ModelAndView joinpage() {
		return new ModelAndView("join");
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
