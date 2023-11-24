package com.employeeExample.employeeManage.service;

import com.employeeExample.employeeManage.dto.EmployeeDTO;
import com.employeeExample.employeeManage.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeService  {

    EmployeeDTO saveEmployee(EmployeeDTO employeeDTO);

    EmployeeDTO getEmployeeById(Long Id);
}
