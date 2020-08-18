package com.rct.machinetestapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FeaturedDataClass {
    @SerializedName("product_id")
    @Expose
    private String productId;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("size_text")
    @Expose
    private String sizeText;
    @SerializedName("weight_class")
    @Expose
    private String weightClass;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("combo")
    @Expose
    private String combo;
    @SerializedName("discount_price")
    @Expose
    private String discountPrice;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("stock_status_id")
    @Expose
    private String stockStatusId;
    @SerializedName("stock_status")
    @Expose
    private String stockStatus;
    @SerializedName("minimum")
    @Expose
    private String minimum;
    @SerializedName("rating")
    @Expose
    private Integer rating;
    @SerializedName("product_filters")
    @Expose
    private List<FeaturedFilterClass> productFilters = null;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSizeText() {
        return sizeText;
    }

    public void setSizeText(String sizeText) {
        this.sizeText = sizeText;
    }

    public String getWeightClass() {
        return weightClass;
    }

    public void setWeightClass(String weightClass) {
        this.weightClass = weightClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCombo() {
        return combo;
    }

    public void setCombo(String combo) {
        this.combo = combo;
    }

    public String getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(String discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStockStatusId() {
        return stockStatusId;
    }

    public void setStockStatusId(String stockStatusId) {
        this.stockStatusId = stockStatusId;
    }

    public String getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(String stockStatus) {
        this.stockStatus = stockStatus;
    }

    public String getMinimum() {
        return minimum;
    }

    public void setMinimum(String minimum) {
        this.minimum = minimum;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public List<FeaturedFilterClass> getProductFilters() {
        return productFilters;
    }

    public void setProductFilters(List<FeaturedFilterClass> productFilters) {
        this.productFilters = productFilters;
    }


}
