package com.CustomerRelationshipManagement.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CustomerRelationshipManagement.entity.Customer;
import com.CustomerRelationshipManagement.service.CustomerService;

import jakarta.websocket.server.PathParam;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        super();
        this.customerService = customerService;
    }

    @PostMapping("/insert")
    public String insertCustomer(@RequestBody Customer customer) {
        String msg = customerService.insertCustomer(customer);
        return msg;
    }

    @GetMapping
    public List<Customer> getCustomersList() {
        List<Customer> list = customerService.getCustomersList();
        return list;
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable int id) {
        return customerService.getCustomerById(id);
    }

    @PutMapping
    public String updateCustomer(@RequestBody Customer customer) {
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable int id) {
        return customerService.deleteCustomer(id);
    }

    @PostMapping
    public String insertMultipleCustomers(@RequestBody List<Customer> customers) {
        return customerService.insertMultipleCustomers(customers);
    }

    @GetMapping("/name/{firstName}")
    public List<Customer> getCustomersByFirstName(@PathVariable String firstName) {
        return customerService.getCustomersByFirstName(firstName);
    }

    @GetMapping("/byAge/{age}")
    public List<Customer> getCustomerByLessThanAge(@PathVariable int age) {
        return customerService.getCustomerByLessThanAge(age);
    }

    @GetMapping("/greaterThanAge/{age}")
    public List<Customer> getCustomerByGreaterThanAge(@PathVariable int age) {
        return customerService.getCustomerByGreaterThanAge(age);
    }

    @GetMapping("/age/{age}")
    public List<Customer> getCustomerByAge(@PathVariable int age) {
        return customerService.getCustomerByAge(age);
    }
}
