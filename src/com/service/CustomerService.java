package com.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pojo.Request;

public class CustomerService {
	private Map<String, List<Request>> requestsByCustomerId;

    public CustomerService() {
        requestsByCustomerId = new HashMap<>(); // Initialize the map here
    }

    public void addRequest(String customerId, Request request) {
        if (!requestsByCustomerId.containsKey(customerId)) {
            requestsByCustomerId.put(customerId, new ArrayList<>());
        }
        requestsByCustomerId.get(customerId).add(request);
    }

    public List<Request> getRequests(String customerId) {
        return requestsByCustomerId.getOrDefault(customerId, new ArrayList<>());
    }
}
