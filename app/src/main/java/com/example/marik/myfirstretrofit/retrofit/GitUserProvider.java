package com.example.marik.myfirstretrofit.retrofit;

import com.example.marik.myfirstretrofit.model.GitUser;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitUserProvider {
    @GET("search/users/{username}?per_page=25")
    Call<List<GitUser>> listUsersByname(@Path("username") String name);
}
