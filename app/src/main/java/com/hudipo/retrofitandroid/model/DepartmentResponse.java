package com.hudipo.retrofitandroid.model;

import java.util.List;

public class DepartmentResponse {


    private List<Department> Departments;

    public DepartmentResponse(List<Department> Departments) {

        this.Departments = Departments;
    }

    public List<Department> getDepartments() {
        return Departments;
    }
}

