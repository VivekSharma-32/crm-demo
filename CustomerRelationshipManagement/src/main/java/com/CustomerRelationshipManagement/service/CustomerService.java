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

    List<Customer> getCustomerByLastName(String lastName);

    List<Customer> getCustomerByEmail(String email);

    List<Customer> getCutomersByMoblieNumber(String mobile);

    String updateCustomerFirstName(int id, String firstName);

    String updateCustomerLastName(int id, String lastName);

    String updateCustomerEmail(int id, String email);

    String updateCustomerMobileNumber(int id, String mobileNumber);

    String updateAge(int id, int age);

    List<String> getCustomersFirstName();

}
