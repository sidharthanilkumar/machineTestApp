package com.rct.machinetestapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FeaturedFilterClass {
    @SerializedName("filter_id")
    @Expose
    private String filterId;
    @SerializedName("name")
    @Expose
    private String name;

    public String getFilterId() {
        return filterId;
    }

    public void setFilterId(String filterId) {
        this.filterId = filterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
