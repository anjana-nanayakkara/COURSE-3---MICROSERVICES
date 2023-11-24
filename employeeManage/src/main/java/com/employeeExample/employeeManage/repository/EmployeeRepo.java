package com.employeeExample.employeeManage.repository;

import com.employeeExample.employeeManage.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
}
