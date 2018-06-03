package com.study.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.study.service.study.StudyService;
import com.study.sevice.employee.LoginService;
import com.study.study.StudyModel;

@Controller
public class LoginController {

	private final static Logger LOGGER = Logger.getLogger(LoginController.class.getName());

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(ModelMap map) {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(ModelMap map) {
		return "login";
	}

	@RequestMapping(value = "/login", method = { RequestMethod.POST })
	public String registration(HttpServletRequest request, HttpServletResponse response) {
		boolean loginStatus = false;
		LOGGER.info("user name =" + request.getParameter("uname") + ", Pwd =" + request.getParameter("pwd"));
		loginStatus = loginService.loginProcess(request.getParameter("uname"), request.getParameter("pwd"));
		if (loginStatus == true) {
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("loginStatus", "true");
			httpSession.setAttribute("username", request.getParameter("uname"));
			return "welcome";
		} else {
			return "error";
		}

	}

	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public String logout(HttpServletRequest request, HttpServletResponse response) {
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("loginStatus", "flase");
		httpSession.setAttribute("username", null);
		httpSession.invalidate();
		return "login";
	}

	@RequestMapping(value = "/study_save", method = RequestMethod.GET)
	public String studySave(HttpServletRequest request, HttpServletResponse response) {
		StudyModel study = new StudyModel();
		StudyService ss = new StudyService();

		// study.setDate(request.getParameter("udate"));
		study.setTimestamp(request.getParameter("udatetime"));
		study.setText(request.getParameter("text"));
		study.setId(Integer.parseInt(request.getParameter("id")));
		ss.studySave(study);
		return "study";
	}

}
