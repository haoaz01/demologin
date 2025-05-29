package hutech.demologin.services;

import hutech.demologin.request.LoginRequest;
import hutech.demologin.request.RegisterRequest;
import hutech.demologin.response.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {

    @POST("/api/v1/register")
    Call<Void> register(@Body RegisterRequest request);

    @POST("/api/v1/login")
    Call<LoginResponse> login(@Body LoginRequest request);

}
