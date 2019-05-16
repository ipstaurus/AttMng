package main.java.com.ipstaurus.attmng.dao;

import javax.servlet.http.HttpSession;

import main.java.com.ipstaurus.attmng.dto.EmployeeDTO;

public interface LoginDAO {
	public int DuplexCheck(EmployeeDTO emp);

	public int LoginCheck(EmployeeDTO emp, HttpSession hSession);
}