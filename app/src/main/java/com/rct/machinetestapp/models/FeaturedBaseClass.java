package com.rct.machinetestapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FeaturedBaseClass {
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("notification_count")
    @Expose
    private String notificationCount;
    @SerializedName("data")
    @Expose
    private List<FeaturedDataClass> data = null;
    @SerializedName("total_product")
    @Expose
    private String totalProduct;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNotificationCount() {
        return notificationCount;
    }

    public void setNotificationCount(String notificationCount) {
        this.notificationCount = notificationCount;
    }

    public List<FeaturedDataClass> getData() {
        return data;
    }

    public void setData(List<FeaturedDataClass> data) {
        this.data = data;
    }

    public String getTotalProduct() {
        return totalProduct;
    }

    public void setTotalProduct(String totalProduct) {
        this.totalProduct = totalProduct;
    }

}
