package com.bit68.marketapp.data.network;

import com.bit68.marketapp.core.Config;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIs {

    private static APIClient apiClient;

    private APIs(){}

    public static synchronized APIClient getApiClient() {
        if(apiClient == null)
        {
            apiClient = new Retrofit.Builder()
                    .baseUrl(Config.API_HOST)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(APIClient.class);

            return apiClient;
        }
        else
            return apiClient;
    }
}

