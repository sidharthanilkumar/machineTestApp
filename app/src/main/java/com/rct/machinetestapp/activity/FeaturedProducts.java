package com.rct.machinetestapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.rct.machinetestapp.R;
import com.rct.machinetestapp.adapters.FeaturedAdapter;
import com.rct.machinetestapp.constants.Constants;
import com.rct.machinetestapp.models.FeaturedBaseClass;
import com.rct.machinetestapp.models.FeaturedDataClass;

import java.util.ArrayList;
import java.util.List;

public class FeaturedProducts extends AppCompatActivity {
    private RecyclerView featuredRecycler;
    private ProgressBar progressBar;
    private FeaturedProductsViewModel featuredProductsViewModel;
    private FeaturedAdapter featuredAdapter;
    private List<FeaturedDataClass> featuredDataClass = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.featured_products);
        setContentView(R.layout.activity_main);
        featuredProductsViewModel = new ViewModelProvider(this).get(FeaturedProductsViewModel.class);
        initView();
        loadData();
    }


    private void initView() {

        featuredRecycler = findViewById(R.id.featuredRecycler);
        progressBar = findViewById(R.id.progressBar);

    }

    private void loadData() {
        featuredProductsViewModel.loadData(Constants.ROUTE_FEATURED, Constants.KEY, "");
        featuredProductsViewModel.getData().observe(this, new Observer<FeaturedBaseClass>() {
            @Override
            public void onChanged(FeaturedBaseClass featuredBaseClass) {
                if (getLifecycle().getCurrentState() == Lifecycle.State.RESUMED)
                    loadRecycler(featuredBaseClass);
            }
        });
    }

    private void loadRecycler(FeaturedBaseClass featuredBaseClass) {
        if (featuredBaseClass != null && featuredBaseClass.getData().size() > 0 && featuredBaseClass.getData() != null) {
            featuredDataClass.addAll(featuredBaseClass.getData());
            initRecycler();
        }else {
            Toast.makeText(getApplicationContext(),"issue",Toast.LENGTH_SHORT).show();
        }
        progressBar.setVisibility(View.GONE);
    }

    private void initRecycler() {
        featuredAdapter = new FeaturedAdapter(featuredDataClass);
        featuredRecycler.setLayoutManager(new GridLayoutManager(this, 2));
        featuredRecycler.setAdapter(featuredAdapter);
    }
}
