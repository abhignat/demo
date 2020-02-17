package com.capg.cust.dao;

import java.util.List;

import com.capg.cust.bean.Customer;

public interface ICustomerDAO {
int addCustomer(Customer c);
	
	int updateCutomer(Customer c);
	
	Customer  getCustomerById(int cid);
	
	int deleteCustomerById(int cid);
	
	List<Customer>  getAllCustomer();

}


