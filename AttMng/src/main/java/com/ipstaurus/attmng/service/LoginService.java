package main.java.com.ipstaurus.attmng.service;

import javax.servlet.http.HttpSession;

import main.java.com.ipstaurus.attmng.dto.EmployeeDTO;

public interface LoginService {

	public int DuplexCheck(EmployeeDTO emp);

	public int LoginCheck(EmployeeDTO emp, HttpSession hSession);

}