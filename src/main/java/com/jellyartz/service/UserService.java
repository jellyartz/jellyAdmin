package com.jellyartz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jellyartz.dao.UserDaoImpl;
import com.jellyartz.model.User;

@Service	
public class UserService {

	@Autowired
	UserDaoImpl usr;	
	public List<User> getallusers(){
		
		return usr.getallUsers();
		
	}
	
}
