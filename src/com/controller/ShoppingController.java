package com.controller;

import com.pojo.Customer;
import com.pojo.Item;
import com.pojo.Request;
import com.service.CustomerService;
import com.service.History;
import com.service.ShoppingCart;

public class ShoppingController {
	 ShoppingCart cart = new ShoppingCart();
	    History history = new History();
	    CustomerService customerService = new CustomerService();

	    public ShoppingController() {
	    	 Customer customer = new Customer("01", "Lily Aldrin", "lilyal@gmail.com");


	        Item item1 = new Item(1, "Laptop", 989.12);
	        Item item2 = new Item(2, "Phone", 67.89);
	        cart.addItem(item1);
	        cart.addItem(item2);

	   
	        history.addHistory(item1);
	        history.addHistory(item2);

	        Request request = new Request("Return Laptop", "Pending");
	        customerService.addRequest(customer.getId(), request);

	        cart.printCart();

	  
	        history.printHistory();

	        System.out.println("Customer service requests for " + customer.getName() + ":");
	        for (Request req : customerService.getRequests(customer.getId())) {
	            System.out.println("Request: " + req.getRequest() + ", Response: " + req.getResponse());
	        }
	    }

	    public static void main(String[] args) {
	        new ShoppingController();
	    }
 }

