package com.example.marik.myfirstretrofit.client;

import com.example.marik.myfirstretrofit.client.GitUser;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GitUserProvider {
  /*  @GET("/search/users?q={username}&per_page=20")
    Call<List<GitUser>> getUsersByName(@Query("username") String name);*/

    @GET("/users")
    Call<List<GitUser>> getUsersByName(@Query("q") String name,@Query("per_page") int limit);
}
