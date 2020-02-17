package com.capg.cust.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.sql.Date;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.capg.cust.bean.Customer;
import com.capg.cust.service.CustomerService;
import com.capg.cust.service.ICustomerService;

class CustomerServiceTest {
	
static	ICustomerService service;
	
	
	@BeforeAll
	
	public static void setUp() {
		
		service=new CustomerService();
		
	}

	@Test
	void testAddCustomer() {

		Customer cust=new Customer();
		
		cust.setCid(505);
		cust.setCname("sams");
		cust.setAmount(90000);
		 cust.setDop(new Date(2020, 2, 24));
		
	int res=service.addCustomer(cust);
		
		assertEquals(1,res);
	}

	@Test
	void testIsValidCid() {
		
	}

	@Test
	void testIsValidCname() {
		
	}

	@Test
	void testUserValidations() {
		
	}

}
