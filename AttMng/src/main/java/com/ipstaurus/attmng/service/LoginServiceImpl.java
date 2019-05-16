package main.java.com.ipstaurus.attmng.service;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import main.java.com.ipstaurus.attmng.dao.LoginDAO;
import main.java.com.ipstaurus.attmng.dto.EmployeeDTO;

@Service
public class LoginServiceImpl implements LoginService {

//	@Inject
	LoginDAO LoginDAO;

	@Override
	public int DuplexCheck(EmployeeDTO emp) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public int LoginCheck(EmployeeDTO emp, HttpSession hSession) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

}