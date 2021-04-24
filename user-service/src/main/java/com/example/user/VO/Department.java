package com.example.user.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    private int departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
