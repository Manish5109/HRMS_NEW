package com.study.restController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestStudy {

	@RequestMapping(value="/restStudy", method = RequestMethod.POST)
	public String form(){
		return "study";
	}
}
