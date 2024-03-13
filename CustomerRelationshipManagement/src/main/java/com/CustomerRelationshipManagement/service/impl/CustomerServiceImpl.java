package com.CustomerRelationshipManagement.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.CustomerRelationshipManagement.dao.CustomerDao;
import com.CustomerRelationshipManagement.entity.Customer;
import com.CustomerRelationshipManagement.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

    CustomerDao customerDao;

    public CustomerServiceImpl(CustomerDao customerDao) {
        super();
        this.customerDao = customerDao;
    }

    @Override
    public String insertCustomer(Customer customer) {

        String msg = customerDao.insertCustomer(customer);

        return msg;
    }

    @Override
    public List<Customer> getCustomersList() {
        List<Customer> list = customerDao.getCustomersList();
        return list;
    }

    @Override
    public Customer getCustomerById(int id) {
        Customer customer = customerDao.getCustomerById(id);
        return customer;
    }

    @Override
    public String updateCustomer(Customer customer) {
        String msg = customerDao.updateCustomer(customer);
        return msg;
    }

    @Override
    public String deleteCustomer(int id) {
        return customerDao.deleteCustomerById(id);
    }

    @Override
    public String insertMultipleCustomers(List<Customer> customers) {
        return customerDao.insertMultipleCustomers(customers);
    }

    @Override
    public List<Customer> getCustomersByFirstName(String firstName) {
        return customerDao.getCustomerByFirstName(firstName);
    }

    @Override
    public List<Customer> getCustomerByLessThanAge(int id) {
        return customerDao.getCustomerByLessThanAge(id);
    }

    @Override
    public List<Customer> getCustomerByGreaterThanAge(int id) {
        return customerDao.getCustomerByGreaterThanAge(id);
    }

    @Override
    public List<Customer> getCustomerByAge(int id) {
        return customerDao.getCustomerByAge(id);
    }

    @Override
    public List<Customer> getCustomerByLastName(String lastName) {
        return customerDao.getCustomerByLastName(lastName);
    }

    @Override
    public List<Customer> getCustomerByEmail(String email) {
        return customerDao.getCustomerByEmail(email);
    }

    @Override
    public List<Customer> getCutomersByMoblieNumber(String mobile) {
        return customerDao.getCustomerByMobileNumber(mobile);
    }

    @Override
    public String updateCustomerLastName(int id, String lastName) {
        return customerDao.updateCustomerLastName(id, lastName);
    }

    @Override
    public String updateCustomerFirstName(int id, String firstName) {
        return customerDao.updateCustomerFirstName(id, firstName);
    }

    @Override
    public String updateCustomerEmail(int id, String email) {
        return customerDao.updateCustomerEmail(id, email);
    }

    @Override
    public String updateCustomerMobileNumber(int id, String mobileNumber) {
        return customerDao.updateCustomerMobileNumber(id, mobileNumber);
    }

    @Override
    public String updateAge(int id, int age) {
        return customerDao.updateAge(id, age);
    }

    @Override
    public List<String> getCustomersFirstName() {
        return customerDao.getCustomersFirstName();
    }

}
