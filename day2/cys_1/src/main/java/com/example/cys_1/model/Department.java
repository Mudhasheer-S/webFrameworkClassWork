package com.example.cys_1.model;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Department {
    
    @JsonProperty("Department Name")
    private String departmentName;
    @JsonProperty("Branch")
    private String branch;
    public Department(String departmentName, String branch) {
        this.departmentName = departmentName;
        this.branch = branch;
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }

    
}
