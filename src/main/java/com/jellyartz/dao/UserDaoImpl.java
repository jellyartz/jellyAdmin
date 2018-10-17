package com.jellyartz.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jellyartz.model.User;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	
	public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
	
	
	@Override
	public List<User> getallUsers() {
		// TODO Auto-generated method stub
		List<User> he=new ArrayList<User>();
		
		
		   jdbcTemplate = new JdbcTemplate(dataSource);
	       List<Map<String, Object>> rows=jdbcTemplate.queryForList(SqlQuery.viewusers);
		   
	       for (Map<String, Object> row : rows) {
	   		User ux = new User();
	   		ux.setUser_id((Integer)row.get("USER_ID"));
	   		ux.setFirst_name((String)row.get("FIRST_NAME"));
	   		ux.setLast_name((String)row.get("LAST_NAME"));
	   		ux.setEmail((String)row.get("EMAIL"));
	   		ux.setCompany_name((String)row.get("COMPANY_NAME"));
	   		ux.setCom_tax_no((String)row.get("COMPANY_TAX_NO"));
	   		ux.setStreet_address((String)row.get("STREET_ADDRESS"));
	   		ux.setCity((String)row.get("CITY"));
	   		ux.setState((String)row.get("STATE"));
	   		ux.setZipcode((String)row.get("ZIPCODE"));
	   		ux.setCountry((String)row.get("COUNTRY"));
	   		ux.setTelphone_number((String)row.get("TELEPHONE_NUMBER"));
	   		ux.setFax_number((String)row.get("FAX_NUMBER"));
	   		he.add(ux);
	   		System.out.println("Added Record---- "+he);
	   	}
	       
	       return he;
		
		
	}
	
	
	
	
	
}
