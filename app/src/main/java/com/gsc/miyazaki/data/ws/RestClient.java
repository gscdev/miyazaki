package com.gsc.miyazaki.data.ws;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.gsc.miyazaki.data.Constants.BASE_URL;

public class RestClient {

    public static Retrofit getClient() {

        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
