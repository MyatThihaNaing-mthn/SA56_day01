package sg.edu.nus.iss.sa56_day01.service;
import java.util.*;
import java.util.ArrayList;
import sg.edu.nus.iss.sa56_day01.model.Employee;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private List<Employee> employees = new ArrayList<Employee>();   
    
    public EmployeeService(){
        employees.add(new Employee("1", "John", "Derrick"));
        employees.add(new Employee("2", "Derrick", "Tan"));
        employees.add(new Employee("3", "Maverick", "Tan"));
    }

    public List<Employee> getAllEmployees(){
        return this.employees;
    }

    public List<Employee> getEmployeesByLastName(String lastName){
        List<Employee> filteredEmployees = employees.stream().filter(emp-> emp.getLastName().equals(lastName)).toList();

        return filteredEmployees;
    }
}
