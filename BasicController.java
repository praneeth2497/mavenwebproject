package com.praneeth.web1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.praneeth.web1.model.Product;

@Controller
public class BasicController {
@RequestMapping("/home")
public ModelAndView m1()
{
	Product p=new Product();
	p.setName("lenovo");
	p.setId(10);
	return new ModelAndView("pro1","v1",p);

}
@RequestMapping("/hardware")
public ModelAndView m2()
{
	return new ModelAndView("pro2");

}

}
