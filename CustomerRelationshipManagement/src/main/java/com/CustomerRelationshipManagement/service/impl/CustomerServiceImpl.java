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

}
