package com.example.babynews.notifications;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Client {

    private static Retrofit retrofit = null;


    private static Retrofit getRetrofit(String url){
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }
}
