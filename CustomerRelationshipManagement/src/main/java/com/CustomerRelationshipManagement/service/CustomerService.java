package com.CustomerRelationshipManagement.service;

import java.util.List;

import com.CustomerRelationshipManagement.entity.Customer;

public interface CustomerService {
    String insertCustomer(Customer customer);

    List<Customer> getCustomersList();

    Customer getCustomerById(int id);

    String updateCustomer(Customer customer);

    String deleteCustomer(int id);

    String insertMultipleCustomers(List<Customer> customers);

    List<Customer> getCustomersByFirstName(String firstName);

    List<Customer> getCustomerByLessThanAge(int id);

    List<Customer> getCustomerByGreaterThanAge(int id);

    List<Customer> getCustomerByAge(int id);
}
