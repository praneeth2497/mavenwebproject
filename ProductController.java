package com.praneeth.web1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.praneeth.web1.dao.ProductDao;
import com.praneeth.web1.model.Product;

@Controller
public class ProductController {
@Autowired
ProductDao dao;
	
	
	@RequestMapping("/products")
	public ModelAndView proInfo()
	{
		return new ModelAndView("showproducts","command",new Product());
	}
	@RequestMapping("/addProduct")
    public ModelAndView saveProduct(@ModelAttribute("pro") Product pro)
    {
        dao.insert(pro);
    ModelAndView mv=new ModelAndView("pro1","productInfo",pro);
    return mv;
    }
	
}
