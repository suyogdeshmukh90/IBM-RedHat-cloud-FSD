package com.model;

import java.util.UUID;

public class CD {
    private String cdID;
    private String cdName;
    private double cdPrice;

    public CD() {
    }

    public CD(String cdName, double cdPrice) {
        this.cdID = UUID.randomUUID().toString();
        this.cdName = cdName;
        this.cdPrice = cdPrice;
    }

    public String getCdID() {
        return cdID;
    }

    public String getCdName() {
        return cdName;
    }

    public double getCdPrice() {
        return cdPrice;
    }

    public void setCdID(String cdID) {
        this.cdID = cdID;
    }

    public void setCdName(String cdName) {
        this.cdName = cdName;
    }

    public void setCdPrice(double cdPrice) {
        this.cdPrice = cdPrice;
    }
    public String getDetails()
    {
        return "ID: "+getCdID()+ "Name: "+getCdName()+"Price: "+getCdPrice();
    }
}
