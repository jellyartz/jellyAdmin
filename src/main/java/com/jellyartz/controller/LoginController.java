package com.jellyartz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(Model model){
		System.out.println("Inside Login Controller");	
		return "login";
	}
	
	@RequestMapping(value="/forgot-password", method=RequestMethod.GET)
	public String forgotpassword(Model model){
		System.out.println("Inside Forgot Password Controller");
		return "forgot-password";
	}
	
	@RequestMapping(value="/dashboard")
	public String insideDashboard(Model model){
		System.out.println("Inside Dashboard Controller");
		return "admin";
	}
	
	@RequestMapping(value="/adminlogin",method=RequestMethod.POST)
	public String loginintoDashboard(@RequestParam("email") String email,@RequestParam("pass") String pass,Model m){
		
		//User user = (User)lgin.verifyUser(email,pass);
	    String final_result=null;
		//System.out.println("User"+user.getPassword());
		System.out.println("Inside Actual Login Login");
	    System.out.println("The email id is : " + email);
	    System.out.println("The password is : "+ pass);
	    
	    if(email.equals("joseph@jellyartz.com") && pass.equals("hello")){
	    	System.out.println("Correct Password!!");
	    	final_result="admin";
	    }
	    else{System.out.println("Wrong Pass");
	    	final_result="redirect:/login.html";	
	    }
	return final_result;
	
}
	
}
