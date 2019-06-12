package com.example.priceshopsimplemvvm.second_activity.view;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.priceshopsimplemvvm.R;
import com.example.priceshopsimplemvvm.databinding.ActivityMainBinding;
import com.example.priceshopsimplemvvm.databinding.ActivitySecondBinding;
import com.example.priceshopsimplemvvm.main_activity.model.PriceModel;
import com.example.priceshopsimplemvvm.main_activity.view.MainActivity;
import com.example.priceshopsimplemvvm.main_activity.viewmodel.PriceViewModel;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_second);
        ActivitySecondBinding secondBinding = DataBindingUtil.setContentView(this,R.layout.activity_second);
        secondBinding.setViewmodel(PriceViewModel.getPriceViewModel());
    }
}
