package com.rct.machinetestapp.network;

import com.rct.machinetestapp.models.FeaturedBaseClass;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiInterface {

    @POST("index.php")
    @FormUrlEncoded
    Call<FeaturedBaseClass> postFeatured(@Query("route") String route,
                                         @Query("api_token")String apiToken,
                                         @Field("user_id")String userid);

}



