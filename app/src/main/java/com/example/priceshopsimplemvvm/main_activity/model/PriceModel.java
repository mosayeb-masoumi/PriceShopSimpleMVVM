package com.example.priceshopsimplemvvm.main_activity.model;

public class PriceModel {
    private int fixed_price;
    private int unit_price;
    private int total_price;

    public PriceModel() {
    }

    public PriceModel(int fixed_price, int unit_price, int total_price) {
        this.fixed_price = fixed_price;
        this.unit_price = unit_price;
        this.total_price = total_price;
    }

    public int getFixed_price() {
        return fixed_price;
    }

    public void setFixed_price(int fixed_price) {
        this.fixed_price = fixed_price;
    }

    public int getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(int unit_price) {
        this.unit_price = unit_price;
    }

    public int getTotal_price() {
        return total_price;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }
}
