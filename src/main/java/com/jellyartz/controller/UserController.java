package com.jellyartz.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jellyartz.model.User;
import com.jellyartz.service.UserService;

@Consumes({"application/json"})
@Produces({"application/json"})
@Controller
public class UserController {

	@Autowired
	UserService userservice;
	
	/*This method is used to get all the expense data*/
	@RequestMapping(value="/getallusers",method=RequestMethod.GET)
	public ResponseEntity<List<User>> fetchallusers(){	
		System.out.println("Inside the fetchallusers controller");
		List<User> getexp=userservice.getallusers();
		System.out.println(getexp.size());
		return new ResponseEntity<List<User>>(getexp,HttpStatus.OK);
	}
}
