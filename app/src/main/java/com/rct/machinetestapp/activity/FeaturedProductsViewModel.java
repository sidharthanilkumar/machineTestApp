package com.rct.machinetestapp.activity;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.rct.machinetestapp.models.FeaturedBaseClass;
import com.rct.machinetestapp.network.RestServiceBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FeaturedProductsViewModel extends AndroidViewModel {
    private MutableLiveData<FeaturedBaseClass> liveData = new MutableLiveData<>();
    private FeaturedBaseClass featuredBaseClass;

    public FeaturedProductsViewModel(@NonNull Application application) {
        super(application);
    }

    public void loadData(String route, String key, String user_id) {

        RestServiceBuilder.getService(getApplication()).postFeatured(route, key,user_id).enqueue(new Callback<FeaturedBaseClass>() {
            @Override
            public void onResponse(Call<FeaturedBaseClass> call, Response<FeaturedBaseClass> response) {
                if (response.isSuccessful()) {
                    featuredBaseClass = response.body();
                    liveData.postValue(featuredBaseClass);
                } else {
                    featuredBaseClass = response.body();
                    liveData.postValue(featuredBaseClass);
                }

            }

            @Override
            public void onFailure(Call<FeaturedBaseClass> call, Throwable t) {
                liveData.postValue(featuredBaseClass);
                Log.e("error",t.toString());
            }
        });

    }

    public LiveData<FeaturedBaseClass> getData() {
        return liveData;
    }
}
