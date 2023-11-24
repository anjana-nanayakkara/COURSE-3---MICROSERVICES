package com.departmentExample.departmentManage.service;

import com.departmentExample.departmentManage.dto.DepartmentDTO;

public interface DepartmentService {

    DepartmentDTO saveDepartment(DepartmentDTO departmentDTO);
    DepartmentDTO getDepartmentByCode(String code);
}
