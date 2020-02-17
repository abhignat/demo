package com.capg.cust.ui;

import java.sql.Date;
import java.util.Scanner;

import com.capg.cust.bean.Customer;
import com.capg.cust.service.CustomerService;
import com.capg.cust.service.ICustomerService;

public class User {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ICustomerService service = new CustomerService();

		while (true) {
			System.out.println("Menu");
			System.out.println("1.add customer");
			System.out.println("2.update");
			System.out.println("3.select");
			System.out.println("4.delete");
			System.out.println("5.select all");
			System.out.println("6.exit");

			System.out.println("enter your choice");
			int choice = scan.nextInt();

			switch (choice) {

			case 1:

				Customer customerBean = new Customer();

				
				System.out.println("enter id");

				int cid = scan.nextInt();
				scan.nextLine();

				System.out.println("enter name");

				String cname = scan.nextLine();

				System.out.println("enter amount");
				double amount = scan.nextDouble();

				customerBean.setCid(cid);
				customerBean.setCname(cname);
				customerBean.setAmount(amount);
				
				boolean isvalid=CustomerService.userValidations(customerBean);
				if(isvalid) {
					
					System.out.println(service.addCustomer(customerBean));
				}
				else {
					System.out.println("invalid");
				}
				break;

			case 2:

				break;

			case 3:

				break;

			case 4:
				break;

			case 5:
				break;
			case 6:

				System.out.println("than you ");

				break;

			default:
				System.err.println("Invalid");

				break;

			}

		}
	}
}
