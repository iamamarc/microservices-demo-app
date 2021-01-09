package com.ognzei.department.service;

import com.ognzei.department.entity.Department;
import com.ognzei.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside the saveDepartment of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findByDepartmentId(Long departmentId) {
        log.info("Inside the findByDepartmentId of DepartmentService");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
