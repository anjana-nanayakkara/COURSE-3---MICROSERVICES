package com.employeeExample.employeeManage.controller;


import com.employeeExample.employeeManage.dto.EmployeeDTO;
import com.employeeExample.employeeManage.service.EmployeeService;
import com.employeeExample.employeeManage.service.serviceIMPL.EmployeeServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<EmployeeDTO> saveEmployee(@RequestBody EmployeeDTO employeeDTO){

        EmployeeDTO savedEmployee = employeeService.saveEmployee(employeeDTO);

        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<EmployeeDTO> saveEmployee(@PathVariable Long id){

        EmployeeDTO employeeDTO = employeeService.getEmployeeById(id);

        return new ResponseEntity<>(employeeDTO, HttpStatus.OK);
    }
}
