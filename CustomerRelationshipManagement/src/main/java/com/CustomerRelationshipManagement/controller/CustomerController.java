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
import java.util.Map;

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

    @GetMapping("/lastName/{lastName}")
    public List<Customer> getCustomerByLastName(@PathVariable String lastName) {
        return customerService.getCustomerByLastName(lastName);
    }

    @GetMapping("/email/{email}")
    public List<Customer> getCustomerByEmail(@PathVariable String email) {
        return customerService.getCustomerByEmail(email);
    }

    @GetMapping("/mobile/{mobile}")
    public List<Customer> getCustomerByMobileNumber(@PathVariable String mobile) {
        return customerService.getCutomersByMoblieNumber(mobile);
    }

    @PutMapping("/fname/{id}")
    public String updateFirstName(@PathVariable int id, @RequestBody Map<String, String> request) {
        String firstName = request.get("firstName");
        return customerService.updateCustomerFirstName(id, firstName);
    }

    @PutMapping("/lname/{id}")
    public String updateLastName(@PathVariable int id, @RequestBody Map<String, String> request) {
        String lastName = request.get("lastName");
        return customerService.updateCustomerLastName(id, lastName);
    }

    @PutMapping("/email/{id}")
    public String updateEmail(@PathVariable int id, @RequestBody Map<String, String> request) {
        String email = request.get("email");
        return customerService.updateCustomerEmail(id, email);
    }

    @PutMapping("/mobile/{id}")
    public String updateMobileNumber(@PathVariable int id, @RequestBody Map<String, String> request) {
        String mobile = request.get("mobileNumber");
        return customerService.updateCustomerMobileNumber(id, mobile);
    }

    @PutMapping("/age/{id}")
    public String updateAge(@PathVariable int id, @RequestBody Map<String, Integer> request) {
        int age = request.get("age");
        return customerService.updateAge(id, age);
    }

    @GetMapping("/firstNames")
    public List<String> getFirstNames() {
        return customerService.getCustomersFirstName();
    }
}
