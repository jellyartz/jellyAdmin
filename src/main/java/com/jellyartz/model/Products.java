package com.jellyartz.model;


import java.sql.*;
//PRODUCT_ID	int(10)
//PRODUCT_NAME	varchar(250)
//PRODUCT_DESC	varchar(500)
//PRODUCT_STRUCTURE	longblob
//PRODUCT_FORMULA	varchar(500)
//PRODUCT_PRICE	decimal(10,2)
//PRODUCT_CATEGORY_ID	int(10)
//CREATED_BY	varchar(120)
//CREATED_ON	date
//CHANGED_BY	varchar(120)
//CHANGED_ON	date

public class Products {

 int product_id;
 String product_name;
 String product_desc;
 Blob product_structure;
 Clob product_formula;
 float product_price;
 float product_category_id;
 String created_by;
 Date created_on;
 String changed_by;
 Date changed_on;
 

 
public int getProduct_id() {
	return product_id;
}
public void setProduct_id(int product_id) {
	this.product_id = product_id;
}
public String getProduct_name() {
	return product_name;
}
public void setProduct_name(String product_name) {
	this.product_name = product_name;
}
public String getProduct_desc() {
	return product_desc;
}
public void setProduct_desc(String product_desc) {
	this.product_desc = product_desc;
}
public Blob getProduct_structure() {
	return product_structure;
}
public void setProduct_structure(Blob product_structure) {
	this.product_structure = product_structure;
}
public Clob getProduct_formula() {
	return product_formula;
}
public void setProduct_formula(Clob product_formula) {
	this.product_formula = product_formula;
}
public float getProduct_price() {
	return product_price;
}
public void setProduct_price(float product_price) {
	this.product_price = product_price;
}
public float getProduct_category_id() {
	return product_category_id;
}
public void setProduct_category_id(float product_category_id) {
	this.product_category_id = product_category_id;
}
public String getCreated_by() {
	return created_by;
}
public void setCreated_by(String created_by) {
	this.created_by = created_by;
}
public Date getCreated_on() {
	return created_on;
}
public void setCreated_on(Date created_on) {
	this.created_on = created_on;
}
public String getChanged_by() {
	return changed_by;
}
public void setChanged_by(String changed_by) {
	this.changed_by = changed_by;
}
public Date getChanged_on() {
	return changed_on;
}
public void setChanged_on(Date changed_on) {
	this.changed_on = changed_on;
}
 
 
 
	
	
}
