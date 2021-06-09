package com.model;

public class SpecialCD extends CD{
    private String feature;

    public SpecialCD(){
        super();
    }

    public SpecialCD(String cdName, double cdPrice, String feature) {
        super(cdName, cdPrice);
        this.feature = feature;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    @Override
    public String getDetails() {
        return super.getDetails()+"Feature: "+getFeature();
    }
}
