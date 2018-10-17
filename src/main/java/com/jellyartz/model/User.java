package com.jellyartz.model;



//USER_ID	int(10)
//FIRST_NAME	varchar(120)
//LAST_NAME	varchar(120)
//EMAIL	varchar(120)
//PASSWORD	varchar(120)
//COMPANY_NAME	varchar(200)
//COMPANY_TAX_NO	varchar(100)
//STREET_ADDRESS	varchar(250)
//CITY	varchar(200)
//STATE	varchar(100)
//ZIPCODE	varchar(50)
//COUNTRY	varchar(200)
//TELEPHONE_NUMBER	varchar(100)
//FAX_NUMBER	varchar(150)

public class User {

	int user_id;
	String first_name;
	String last_name;
	String email;
	String password;
	String company_name;
	String com_tax_no;
	String street_address;
	String city;
	String state;
	String zipcode;
	String country;
	String telphone_number;
	String fax_number;
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getCom_tax_no() {
		return com_tax_no;
	}
	public void setCom_tax_no(String com_tax_no) {
		this.com_tax_no = com_tax_no;
	}
	public String getStreet_address() {
		return street_address;
	}
	public void setStreet_address(String street_address) {
		this.street_address = street_address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getTelphone_number() {
		return telphone_number;
	}
	public void setTelphone_number(String telphone_number) {
		this.telphone_number = telphone_number;
	}
	public String getFax_number() {
		return fax_number;
	}
	public void setFax_number(String fax_number) {
		this.fax_number = fax_number;
	}
	
	
	
	
}
