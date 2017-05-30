package com.hyperion.ths.marvel_03.ui.main;

import com.hyperion.ths.marvel_03.ui.BaseViewModel;

/**
 * Created by ths on 27/05/2017.
 */

public class MainViewModel extends BaseViewModel {
    private MainViewPageAdapter mMainViewPageAdapter;
    public MainViewModel(MainViewPageAdapter mainViewPageAdapter) {
        mMainViewPageAdapter = mainViewPageAdapter;
    }

    public MainViewPageAdapter getMainViewPageAdapter() {
        return mMainViewPageAdapter;
    }
}
