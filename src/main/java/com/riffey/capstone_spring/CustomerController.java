package com.riffey.capstone_spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService service;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<Customers> listCustomers = service.listAll();
        model.addAttribute("listCustomers", listCustomers);

        return "index";
    }

    @RequestMapping("/edit/{custId}")
    public ModelAndView showEditCustomerPage(@PathVariable(name = "custId") int custId) {
        ModelAndView mav = new ModelAndView("edit_customer");
        Customers customers = service.get(custId);
        mav.addObject("customers", customers);
        return mav;
    }


}
