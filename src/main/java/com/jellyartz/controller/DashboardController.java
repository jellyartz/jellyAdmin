package com.jellyartz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DashboardController {

	/*User Controllers*/
	@RequestMapping(value="/view-users", method=RequestMethod.GET)
	public String viewuser(Model model){
		System.out.println("Inside View User Controller");	
		return "view-user";
	}
	
	
	/*Add Product Route Controllers*/
    @RequestMapping(value="/add-product",method=RequestMethod.GET)
	public String addproduct(Model model){
		System.out.println("Inside Add Products Route Ccontroller");
		return "add-product";
	}
    
    /*View Product Route Controller*/
    @RequestMapping(value="/view-product",method=RequestMethod.GET)
    public String viewproduct(){
    	System.out.println("Inside View Product Route Controller");
    	return "view-product";
    }
}
