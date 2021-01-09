package com.ognzei.department.controller;

import com.ognzei.department.entity.Department;
import com.ognzei.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside the saveDepartment method of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{Id}")
    public Department findDepartmentById(@PathVariable("Id") Long departmentId){
        log.info("Inside the findDepartmentById method of DepartmentController");
        return departmentService.findByDepartmentId(departmentId);
    }

}
