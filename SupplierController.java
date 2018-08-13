package com.praneeth.web1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.praneeth.web1.dao.SupplierDao;
import com.praneeth.web1.model.Category;
import com.praneeth.web1.model.Supplier;

@Controller
public class SupplierController {
	
	@Autowired
	SupplierDao sdao;
	@RequestMapping("/supplier")
	public ModelAndView m1()
	{
		return new ModelAndView("showsupplier","command",new Supplier());
	}
	@RequestMapping("/addSupplier")
	public ModelAndView saveProduct(@ModelAttribute("sup") Supplier sup)
	{
	   sdao.insert(sup); 
	ModelAndView mv=new ModelAndView("supplier","supInfo",sup);
	return mv;
	}
}
