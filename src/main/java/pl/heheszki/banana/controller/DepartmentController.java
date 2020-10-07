package pl.heheszki.banana.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.heheszki.banana.model.DepartmentEntity;
import pl.heheszki.banana.repository.DepartmentEntityRepo;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class DepartmentController {

    @Autowired
    private DepartmentEntityRepo departmentEntityRepo;

    //get all departments
    @GetMapping("/departments")
    public List <DepartmentEntity> getAllDep (){
        return departmentEntityRepo.findAll();
    }
}
