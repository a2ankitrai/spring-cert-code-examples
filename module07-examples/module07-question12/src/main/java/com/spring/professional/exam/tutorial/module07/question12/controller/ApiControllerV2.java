package com.spring.professional.exam.tutorial.module07.question12.controller;

import com.spring.professional.exam.tutorial.module07.question12.dao.AddressesDao;
import com.spring.professional.exam.tutorial.module07.question12.dao.CustomersDao;
import com.spring.professional.exam.tutorial.module07.question12.ds.Address;
import com.spring.professional.exam.tutorial.module07.question12.ds.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/v2")
public class ApiControllerV2 {

    @Autowired
    private CustomersDao customersDao;
    @Autowired
    private AddressesDao addressesDao;

    // curl localhost:8080/api/v2/customers |jq
    @GetMapping("customers")
    public @ResponseBody Iterable<Customer> listCustomers() {
        return customersDao.findAll();
    }

    // curl localhost:8080/api/v2/addresses |jq
    @GetMapping("addresses")
    @ResponseBody
    public Iterable<Address> listAddresses() {
        return addressesDao.findAll();
    }
}
