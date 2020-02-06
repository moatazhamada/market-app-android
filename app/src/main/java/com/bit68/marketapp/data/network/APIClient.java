package com.bit68.marketapp.data.network;

import com.bit68.marketapp.data.models.Categories;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
public interface APIClient {

    // Categories
    @GET("categories")
    Call<List<Categories>> getCategories();
}
