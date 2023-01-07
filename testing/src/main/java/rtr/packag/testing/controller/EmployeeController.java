package rtr.packag.testing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import rtr.packag.testing.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping
    public String ViewhomePage(Model model){
        model.addAttribute("listEmployees",employeeService.getAllEmployees());
        return "index";
    }
}
