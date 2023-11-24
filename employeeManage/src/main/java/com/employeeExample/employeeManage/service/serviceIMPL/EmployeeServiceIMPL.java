package com.employeeExample.employeeManage.service.serviceIMPL;

import com.employeeExample.employeeManage.dto.EmployeeDTO;
import com.employeeExample.employeeManage.entity.Employee;
import com.employeeExample.employeeManage.repository.EmployeeRepo;
import com.employeeExample.employeeManage.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceIMPL implements EmployeeService {

    private  EmployeeRepo employeeRepo;
    @Override
    public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee(
                employeeDTO.getId(),
                employeeDTO.getFname(),
                employeeDTO.getLname(),
                employeeDTO.getEmail()
        );
        Employee savedEmployee = employeeRepo.save(employee);

        EmployeeDTO savedEmployeeDTO = new EmployeeDTO(
                savedEmployee.getId(),
                savedEmployee.getFname(),
                savedEmployee.getLname(),
                savedEmployee.getEmail()
        );



        return savedEmployeeDTO;
    }

    @Override
    public EmployeeDTO getEmployeeById(Long id) {


        Employee employee = employeeRepo.findById(id).get();

        EmployeeDTO employeeDTO = new EmployeeDTO(
                employee.getId(),
                employee.getFname(),
                employee.getLname(),
                employee.getEmail()
        );
        return employeeDTO;
    }


}
