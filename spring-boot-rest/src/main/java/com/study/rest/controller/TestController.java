package com.study.rest.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.study.service.study.StudyService;
import com.study.study.StudyModel;

@RestController
@RequestMapping("/test")
public class TestController {

	@Autowired
	private StudyService ss;

	@RequestMapping(method = RequestMethod.GET)
	public String get() {
		return "hello worldddddddddddddd";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String post(HttpServletRequest request) {
		request.getParameter("name");
		return "hello worldddddddddddddd";
	}

	@RequestMapping(value = "/saveDetail", method = RequestMethod.POST)
	public String save(HttpServletRequest request) {
		StudyModel study = new StudyModel();
		study.setTimestamp(request.getParameter("udatetime"));
		study.setText(request.getParameter("text"));
		study.setId(Integer.parseInt(request.getParameter("id")));
		ss.studySave(study);
		return "Detail Saved";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String delete(HttpServletRequest request) {
		StudyModel study = new StudyModel();
		String id = request.getParameter("id");
		ss.delete(id);
		return "Detail Saved";
	}
}
