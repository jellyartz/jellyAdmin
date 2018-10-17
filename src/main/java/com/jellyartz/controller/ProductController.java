package com.jellyartz.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jellyartz.model.Products;
import com.jellyartz.model.User;


@Produces({"application/json"})
@Consumes({"application/json"})
@Controller
public class ProductController {

	
	
	/*Method to add product into the DB*/
	@RequestMapping(value="/insertproducts",method=RequestMethod.POST)
	public ResponseEntity<String> addproduct(@RequestBody Products pro){
		
		return new ResponseEntity<String>("Hello",HttpStatus.OK);
	}
	
	
	
	
	/*Method to add an expense in the db*/
	@RequestMapping(value="/addintoexp",method=RequestMethod.POST)
	public ResponseEntity<String> addexpense(@RequestBody Products expp,HttpSession s){
		
		//System.out.println(s.getAttribute("usernam"));

		
		return new ResponseEntity<String>("Hello",HttpStatus.OK);
	}
	
	
}
