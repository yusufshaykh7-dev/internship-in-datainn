
package com.crm.controller;

import com.crm.model.Customer;
import com.crm.repository.CustomerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CustomerController {

    private final CustomerRepository repo;

    public CustomerController(CustomerRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/")
    public String dashboard(Model model) {
        model.addAttribute("count", repo.count());
        model.addAttribute("customers", repo.findAll());
        return "dashboard";
    }

    @PostMapping("/add")
    public String addCustomer(Customer customer) {
        repo.save(customer);
        return "redirect:/";
    }
}
