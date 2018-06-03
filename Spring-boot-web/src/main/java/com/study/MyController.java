package com.study;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/")
	public String index() {
		return "welcome";
	}
	@RequestMapping(value="/btn")
	public String btn(){
		return "index";
	}
}
