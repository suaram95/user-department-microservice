package com.example.department.controller;

import com.example.department.entity.Department;
import com.example.department.service.DepartmentServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentServiceImpl departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside saveDepartment method of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") int departmentId){
        log.info("Inside findDepartmentById method of DepartmentController");
        return departmentService.findByDepartmentId(departmentId);
    }
}
