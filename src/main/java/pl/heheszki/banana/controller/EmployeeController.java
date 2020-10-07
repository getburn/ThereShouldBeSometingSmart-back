package pl.heheszki.banana.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.heheszki.banana.model.EmployeeEntity;
import pl.heheszki.banana.repository.EmployeeEntityRepo;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/menu")
public class EmployeeController {

    @Autowired
    private EmployeeEntityRepo employeeEntityRepo;

    //get all employees
    @GetMapping("/employees")
    public List<EmployeeEntity> getAllEmp(){
        return employeeEntityRepo.findAll();
    }

    //create employee
    @PostMapping ("/employees")
    public EmployeeEntity createEmployee(@RequestBody EmployeeEntity employeeEntity){
        return employeeEntityRepo.save(employeeEntity);
    }

    //update employyee
    @PutMapping("/employees")
    public EmployeeEntity updateEmployee (@RequestBody EmployeeEntity employeeEntity){
        return employeeEntityRepo.save(employeeEntity);
    }
}