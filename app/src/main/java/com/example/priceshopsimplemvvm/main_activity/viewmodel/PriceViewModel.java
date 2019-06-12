package com.example.priceshopsimplemvvm.main_activity.viewmodel;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.priceshopsimplemvvm.BR;
import com.example.priceshopsimplemvvm.main_activity.model.PriceModel;
import com.example.priceshopsimplemvvm.second_activity.view.SecondActivity;


public class PriceViewModel extends BaseObservable {

    private int unit_price;
    private int total_price;
    private int fixed_price = 1500;

    Context context;


    public PriceViewModel(PriceModel priceModel) {
        this.unit_price = priceModel.getUnit_price();
        this.total_price = priceModel.getTotal_price();
        this.fixed_price = priceModel.getFixed_price();
    }

    public PriceViewModel(Context context) {
        this.context = context;

        //for sendind viewmodel to second Activity
        priceViewModel=this;
    }

    @Bindable
    public int getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(int unit_price) {
        this.unit_price = unit_price;
        notifyPropertyChanged(BR.unit_price);
    }
    @Bindable
    public int getTotal_price() {
        return total_price;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
        notifyPropertyChanged(BR.total_price);
    }

    @Bindable
    public int getFixed_price() {
        return fixed_price;
    }

    public void setFixed_price(int fixed_price) {
        this.fixed_price = fixed_price;
        notifyPropertyChanged(BR.fixed_price);
    }


    int plus ;
    public void plusBtn(){
        plus++;
        setUnit_price(plus);
        int total = getUnit_price()*1500;
        setTotal_price(total);
    }

    public void decreadeBtn(){
        if(plus == 0){
            plus = 0;
        }else{
            plus -- ;
        }
        setUnit_price(plus);
        int total = getUnit_price()*1500;
        setTotal_price(total);
    }


    public void btnClicked(){
        context.startActivity(new Intent(context, SecondActivity.class));
    }





    // to send viewmodel to secondActivity(without making new)
    public static PriceViewModel priceViewModel;

// make a getter for sending viewmodel to second activity
    public static PriceViewModel getPriceViewModel() {
        return priceViewModel;
    }
}
