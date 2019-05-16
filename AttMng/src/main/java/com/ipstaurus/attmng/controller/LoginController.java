package main.java.com.ipstaurus.attmng.controller;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import main.java.com.ipstaurus.attmng.dao.LoginDAO;
import main.java.com.ipstaurus.attmng.dto.EmployeeDTO;

@Controller
public class LoginController {

	@Autowired
	private LoginDAO LoginDAO;

	//GET으로 /페이지를 요청
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String login() {
        //jsp 폴더애 login.jsp 파일을 뷰페이지로 선언
        return "login";
    }

    //body의 값을 매핑하는 용도
    @ResponseBody
    //POST로 Login으로 요청을 할 경우
    @RequestMapping(value = "Login", method = RequestMethod.POST)
    //login이라는 메소드명을 가지고 매개변수는 member m, Httpsession session
    public int login(EmployeeDTO emp, HttpSession session) {
        //m_dao.Login(emp, session)을 호출하고 반환한다.
        return LoginDAO.LoginCheck(emp, session);
    }

    /*//GET으로 reigster페이지를 요청 할 경우
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register() {
        //view안에 있는 register.jsp를 뷰페이지로 지정한다.
        return "register";
    }
    //body의 값을 매핑하는 용도
    @ResponseBody
    //POST로 /register 페이지로 요청을 할 경우
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    //메소드 이름이 register 매게변수는 member 자료형의 변수명은 m
    public int register(EmployeeDTO m) {
        //m_dao.Register(m)의 값을 반환한다.
        return LoginDAO.Register(m);
    }*/

    /*// GET으로 /index페이지에 요청을 할 때
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        //view폴더에 있는 index.jsp를 뷰페이지로 선언한다.
        return "index";
    }*/

    /*//로그아웃 관련 페이지
    // /logout으로 GET 방식으로 페이지를 접근하게 된다면
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    //메소드 이름은 LOGOUT 매게 변수는 SESSION
    public String logout(HttpSession session) {
        //m으로 선언된 세션을 삭제시킨다.
        session.removeAttribute("m");
        // /페이지로 리다이렉트 시킨다.
        return "redirect:/";
    }*/

}