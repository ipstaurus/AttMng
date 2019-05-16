/*package main.java.com.ipstaurus.attmng.Controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import main.java.com.ipstaurus.attmng.DAO.LoginDAO;
import main.java.com.ipstaurus.attmng.Service.LoginService;

@Controller
public class LoginController {

   @Autowired
   LoginService loginService;
   LoginDAO logDAO;

   private static final Logger log = LoggerFactory.getLogger(LoginController.class);

   @RequestMapping(value = "/login.do")
   @ResponseBody
   public int login(String id, String password, HttpSession session) {

      HashMap<String, String> hstParam = new HashMap<String, String>();

      hstParam.put("id", id);

      hstParam.put("password", password);

      int loginIdentify = loginService.loginCheck(hstParam);

      if (loginIdentify == 1) {

         session.setAttribute("id", id);

         session.setAttribute("password", password);

      }

      return loginIdentify;

   }

   @RequestMapping(value = "/loginpage.do")
   public ModelAndView loginpage(HttpSession session) {

      ModelAndView mav = new ModelAndView();

      String id = (String) session.getAttribute("id");

      if (id != null) { //session check

         mav.setViewName("redirect:/main.do");

         return mav;

      }

      mav.setViewName("/login/loginpage");

      return mav;

   }

}*/