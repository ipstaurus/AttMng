package main.java.com.ipstaurus.attmng.Service;


import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.com.ipstaurus.attmng.DAO.LoginDAO;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginDAO logDAO;

	@Override
	public int loginCheck(HashMap<String, String> hstParam){

		// TODO Auto-generated method stub

		int identify = logDAO.loginIdentify(hstParam);

		return identify;

	}

}