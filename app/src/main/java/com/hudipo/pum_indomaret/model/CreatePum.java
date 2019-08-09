package com.hudipo.pum_indomaret.model;

public class CreatePum {
    private String emp_name;
    private String emp_dept;
    private String use_date;
    private String resp_date;
    private String doc_num;
    private String trx_type;
    private String description;
    private String amount;
    private String upload_file;

    public CreatePum(String emp_name, String EMP_dept, String use_date, String resp_date, String doc_num, String trx_type, String decription, String amount, String upload_file) {
        this.emp_name = emp_name;
        this.emp_dept = EMP_dept;
        this.use_date = use_date;
        this.resp_date = resp_date;
        this.doc_num = doc_num;
        this.trx_type = trx_type;
        this.description = decription;
        this.amount = amount;
        this.upload_file = upload_file;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_dept() {
        return emp_dept;
    }

    public void setEmp_dept(String emp_dept) {
        this.emp_dept = emp_dept;
    }

    public String getUse_date() {
        return use_date;
    }

    public void setUse_date(String use_date) {
        this.use_date = use_date;
    }

    public String getResp_date() {
        return resp_date;
    }

    public void setResp_date(String resp_date) {
        this.resp_date = resp_date;
    }

    public String getDoc_num() {
        return doc_num;
    }

    public void setDoc_num(String doc_num) {
        this.doc_num = doc_num;
    }

    public String getTrx_type() {
        return trx_type;
    }

    public void setTrx_type(String trx_type) {
        this.trx_type = trx_type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getUpload_file() {
        return upload_file;
    }

    public void setUpload_file(String upload_file) {
        this.upload_file = upload_file;
    }
}
