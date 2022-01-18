package com.example.android.newsapp;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface RetroFitApi {

    @GET
    Call<NewsModel> getAllNews(@Url String url);

    @GET("")
    Call<NewsModel> getAllCategories(@Url String url);
}
