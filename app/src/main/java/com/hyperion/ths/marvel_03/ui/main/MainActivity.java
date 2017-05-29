package com.hyperion.ths.marvel_03.ui.main;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.hyperion.ths.marvel_03.R;
import com.hyperion.ths.marvel_03.databinding.ActivityMainBinding;

/**
 * Created by ths on 27/05/2017.
 */

public class MainActivity extends AppCompatActivity {
    private MainViewModel mMainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainViewPageAdapter mainViewPageAdapter =
                new MainViewPageAdapter(getSupportFragmentManager(), this);
        mMainViewModel = new MainViewModel(mainViewPageAdapter);

        binding.setViewModel(mMainViewModel);
    }
}
