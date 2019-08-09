package com.hudipo.pum_indomaret.api;

import com.hudipo.pum_indomaret.model.CreatePum;
import com.hudipo.pum_indomaret.model.CreatePumResponse;
import com.hudipo.pum_indomaret.model.DefaultResponse;
import com.hudipo.pum_indomaret.model.DepartmentResponse;
import com.hudipo.pum_indomaret.model.DocumentsResponse;
import com.hudipo.pum_indomaret.model.LoginResponse;
import com.hudipo.pum_indomaret.model.TrxResponse;
import com.hudipo.pum_indomaret.model.UsersResponse;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Api {


    @FormUrlEncoded
    @POST("register")
    Call<DefaultResponse> register(
            @Field("emp_num") String emp_num,
            @Field("password") String password,
            @Field("pin") String pin
    );

    @FormUrlEncoded
    @POST("login")
    Call<LoginResponse> login(
            @Field("emp_num") String emp_email,
            @Field("password") String password
    );

    @POST("createpum")
    Call<CreatePumResponse> createPum(
            @Field("emp_name") String emp_name,
            @Field("emp_dept")String emp_dept,
            @Field("use_date")String use_date,
            @Field("resp_date")String resp_date,
            @Field("doc_num")String doc_num,
            @Field("trx_type")String trx_type,
            @Field("description")String description,
            @Field("currency")String currency,
            @Field("amount")String amount,
            @Field("amount")String upload_file

    );

//    @POST("doctype")
//    Call<DocumentsResponse> getDocument(
//            @Field("doc_type") String doc_type
//    );

    @GET("documents")
    Call<DocumentsResponse> getDocument();

    @GET("getdept")
    Call<DepartmentResponse> getDepartments();

    @GET("gettrxtype")
    Call<TrxResponse> getTrx();



//    @GET("gettrxtype")
//    Call<TrxResponse> getDepartment();



//    @GET("inboxs")
//    Call<InboxsResponse> getInbox();






}
