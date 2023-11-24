package com.departmentExample.departmentManage.service.serviceIMPL;

import com.departmentExample.departmentManage.dto.DepartmentDTO;
import com.departmentExample.departmentManage.entity.Department;
import com.departmentExample.departmentManage.repository.DepartmentRepo;
import com.departmentExample.departmentManage.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceIMPL implements DepartmentService {

    private DepartmentRepo departmentRepo;
    @Override
    public DepartmentDTO saveDepartment(DepartmentDTO departmentDTO) {

        Department department = new Department(
                departmentDTO.getId(),
                departmentDTO.getDepartmentName(),
                departmentDTO.getDepartmentDesc(),
                departmentDTO.getDepartmentCode()
        );

        Department savedDepartment = departmentRepo.save(department);

        DepartmentDTO savedDepartmentDTO = new DepartmentDTO(
                savedDepartment.getId(),
                savedDepartment.getDepartmentName(),
                savedDepartment.getDepartmentDesc(),
                savedDepartment.getDepartmentCode()

        );
        return savedDepartmentDTO;
    }

    @Override
    public DepartmentDTO getDepartmentByCode(String code) {
        Department department = departmentRepo.findByDepartmentCode(code);

        DepartmentDTO departmentDTO = new DepartmentDTO(
                department.getId(),
                department.getDepartmentName(),
                department.getDepartmentDesc(),
                department.getDepartmentCode()
        );

        return departmentDTO;
    }
}
