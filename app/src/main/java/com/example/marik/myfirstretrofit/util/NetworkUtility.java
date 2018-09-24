package com.example.marik.myfirstretrofit.util;

import android.content.Context;
import android.net.ConnectivityManager;

public final class NetworkUtility {
    private NetworkUtility(){}

    public static boolean isNetworkAvalable(Context context){
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected();
    }
}
