package sg.edu.nus.iss.sa56_day01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import sg.edu.nus.iss.sa56_day01.service.EmployeeService;
import sg.edu.nus.iss.sa56_day01.model.Employee;
import java.util.*;
//RequestMapping
//GetMapping (Retrieve)
//PostMapping
//PutMapping
//DeleteMapping
//client request the controller, the controller invoke the service,

@Controller
@RequestMapping(path = "/employees")
public class EmployeeController {
    @Autowired // insted of initializing service object in controller's constructor, kind of dependency injection
    EmployeeService empSvc;

    // public EmployeeController(){
    //     empSvc = new EmployeeService();
    // }
    

    //to be in the body of the response
    @GetMapping(value = "/list")
    public @ResponseBody List<Employee> getAllEmployees(){
        return empSvc.getAllEmployees();
    }

    @GetMapping(value = "/filterlist")
    public @ResponseBody List<Employee> getFilterEmployees(){
        return empSvc.getEmployeesByLastName("Tan");
    }
}
