package com.spring_boot.projectEx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductInfoController {
	@RequestMapping("/html/prdInfo")
	public String prdInfo() {
		
		return "/html/prdInfo";
	}
	

}
