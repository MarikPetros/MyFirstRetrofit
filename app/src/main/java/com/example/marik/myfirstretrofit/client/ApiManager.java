package com.example.marik.myfirstretrofit.client;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiManager {
    public static String BASE_URL = "https://api.github.com";
    private static GitUserProvider mClientApi;

    public static GitUserProvider gitClientApi() {
        if (mClientApi == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            mClientApi = retrofit.create(GitUserProvider.class);
        }
        return mClientApi;
    }
}