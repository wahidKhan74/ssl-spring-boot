package com.simplilearn.ecom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResourceController {

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "Server is running under SSL";
	}
}
