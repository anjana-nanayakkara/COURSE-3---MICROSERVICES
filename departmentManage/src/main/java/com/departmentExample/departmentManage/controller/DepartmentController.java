package com.departmentExample.departmentManage.controller;

import com.departmentExample.departmentManage.dto.DepartmentDTO;
import com.departmentExample.departmentManage.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public ResponseEntity<DepartmentDTO> saveDepartment(@RequestBody DepartmentDTO departmentDTO){
        DepartmentDTO saveDepartment = departmentService.saveDepartment(departmentDTO);
        return new ResponseEntity<>(saveDepartment, HttpStatus.CREATED);
    }

    @GetMapping("{department-code}")
    public ResponseEntity<DepartmentDTO> getDepartment(@PathVariable(value = "department-code") String departmentCode){
        DepartmentDTO departmentDTO = departmentService.getDepartmentByCode(departmentCode);
        return new ResponseEntity<>(departmentDTO, HttpStatus.OK);
    }
}
