package com.model;

public class HollywoodCD extends CD {
    private String languageCode;

    public HollywoodCD() {
        super();
    }

    public HollywoodCD(String cdName, double cdPrice, String languageCode) {
        super(cdName, cdPrice);
        this.languageCode = languageCode;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    @Override
    public String getDetails() {
        return super.getDetails()+"LanguageCode: "+getLanguageCode();
    }
}
