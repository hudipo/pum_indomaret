package com.hudipo.pum_indomaret.model;

import com.google.gson.annotations.SerializedName;

public class TrxResponse {
    private boolean error;
    @SerializedName("department")
    private Department[] departments;

    public TrxResponse(boolean error, Department[] departments) {
        this.error = error;
        this.departments = departments;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }
}


