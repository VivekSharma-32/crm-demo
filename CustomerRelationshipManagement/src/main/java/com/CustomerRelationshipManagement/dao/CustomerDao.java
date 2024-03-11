package com.CustomerRelationshipManagement.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.CustomerRelationshipManagement.entity.Customer;

@Repository
public class CustomerDao {

    // This class is used to implement the database code
    SessionFactory sf;

    public CustomerDao(SessionFactory sf) {
        super();
        this.sf = sf;
    }

    public String insertCustomer(Customer customer) {
        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();
        session.save(customer);
        tr.commit();
        session.close();
        return "Customer inserted successfully";
    }

    public List<Customer> getCustomersList() {
        Session session = sf.openSession();
        return session.createQuery("from Customer").list();
    }

    public Customer getCustomerById(int id) {
        // get -> it will return null if object not found in database
        // load -> it will return ObjectNotFound exception if object not found in
        // database
        Session session = sf.openSession();
        Customer customer = session.get(Customer.class, id);
        return customer;
    }

    public String updateCustomer(Customer customer) {
        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();
        session.update(customer);
        tr.commit();
        session.close();
        return "Customer updated successfully";
    }

    public String deleteCustomerById(int id) {
        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();
        Customer customer = session.get(Customer.class, id);
        session.delete(customer);
        tr.commit();
        session.close();
        return "Customer deleted successfully";
    }

    public String insertMultipleCustomers(List<Customer> customers) {
        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();
        for (Customer customer : customers) {
            session.save(customer);
        }
        tr.commit();
        session.close();
        return "Customers inserted successfully";
    }

    public List<Customer> getCustomerByFirstName(String firstName) {
        Session session = sf.openSession();
        Query<Customer> customers = session.createQuery("from Customer c where c.firstName = :firstName",
                Customer.class);

        customers.setParameter("firstName", firstName);
        List<Customer> list = customers.list();

        return list;
    }

    public List<Customer> getCustomerByLessThanAge(int age) {
        Session session = sf.openSession();
        Query<Customer> customers = session.createQuery("from Customer c where c.age < :age",
                Customer.class);
        customers.setParameter("age", age);
        List<Customer> list = customers.list();
        return list;
    }

    public List<Customer> getCustomerByGreaterThanAge(int age) {
        Session session = sf.openSession();
        Query<Customer> customers = session.createQuery("from Customer c where c.age > :age",
                Customer.class);
        customers.setParameter("age", age);
        List<Customer> list = customers.list();
        return list;
    }

    public List<Customer> getCustomerByAge(int age) {
        Session session = sf.openSession();
        Query<Customer> customers = session.createQuery("from Customer c where c.age = :age",
                Customer.class);
        customers.setParameter("age", age);
        List<Customer> list = customers.list();
        return list;
    }
}
