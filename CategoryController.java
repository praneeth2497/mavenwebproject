package com.praneeth.web1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.praneeth.web1.dao.CategoryDao;
import com.praneeth.web1.model.Category;
import com.praneeth.web1.model.Product;



@Controller
public class CategoryController {
	
	@Autowired
	CategoryDao cdao;
@RequestMapping("/categories")
public ModelAndView m1()
{
	return new ModelAndView("showcategory","command",new Category());
}
@RequestMapping("/addCategory")
public ModelAndView saveProduct(@ModelAttribute("cat") Category cat)
{
    cdao.insert(cat);
ModelAndView mv=new ModelAndView("category","catInfo",cat);
return mv;
}
}
