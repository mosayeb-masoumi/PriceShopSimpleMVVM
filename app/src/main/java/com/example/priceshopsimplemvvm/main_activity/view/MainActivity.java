package com.example.priceshopsimplemvvm.main_activity.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.priceshopsimplemvvm.R;
import com.example.priceshopsimplemvvm.databinding.ActivityMainBinding;
import com.example.priceshopsimplemvvm.main_activity.viewmodel.PriceViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        ActivityMainBinding mainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        PriceViewModel viewModel=new PriceViewModel(this);
        mainBinding.setViewmodel(viewModel);
    }



}
