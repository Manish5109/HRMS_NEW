package com.study.sevice.employee;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.doa.login.LoginDOA;
import com.study.model.login.Login;

@Service
public class LoginService {
	private final static Logger LOGGER = Logger.getLogger(LoginService.class.getName());
	@Autowired
	private LoginDOA loginDoa;

	public void saveLogin(Login login) {
		loginDoa.loginSave(login);
	}

	public boolean loginProcess(String user, String pwd) {
		boolean flag = false;
		String uname = user;
		String passwd = pwd;
		LOGGER.info("user name =" + user + ", Pwd =" + pwd);
		flag = loginDoa.login(uname, passwd);

		return flag;
	}
}
