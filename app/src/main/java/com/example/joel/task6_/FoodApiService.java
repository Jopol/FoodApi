package com.example.joel.task6_;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface FoodApiService {


    String BASE_URL = "https://www.food2fork.com/";
    String KEY = "e73e8d4f633c231dd78356a7091fb940";

    /**
     * Create a retrofit client.
     */

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();


    //@GET("search?key=" + KEY + "&sort=" + SORT)
    @GET("api/search?key=" + KEY + "&sort=r&count=3")

    Call<RecipeList> getRecipes();

}