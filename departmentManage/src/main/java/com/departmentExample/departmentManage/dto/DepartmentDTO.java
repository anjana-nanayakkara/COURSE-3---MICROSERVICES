package com.departmentExample.departmentManage.dto;

import jakarta.persistence.Entity;
import lombok.Data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDTO {

    private Long id;
    private String departmentName;
    private String departmentDesc;
    private String departmentCode;
}
