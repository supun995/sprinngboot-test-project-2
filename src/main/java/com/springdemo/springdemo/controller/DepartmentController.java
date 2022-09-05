package com.springdemo.springdemo.controller;

import com.springdemo.springdemo.entity.Department;
import com.springdemo.springdemo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentbyId(@PathVariable("id") Long departmentId){
        return departmentService.findDepartmentById(departmentId);
    }

}
