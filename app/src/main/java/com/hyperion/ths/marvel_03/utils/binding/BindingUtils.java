package com.hyperion.ths.marvel_03.utils.binding;

import android.databinding.BindingAdapter;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import com.hyperion.ths.marvel_03.ui.main.MainViewPageAdapter;

/**
 * Created by ths on 27/05/2017.
 */

public final class BindingUtils {
    private BindingUtils() {
    }

    @BindingAdapter("adapterViewPage")
    public static void setAdapterViewPage(final ViewPager viewPage,
            final MainViewPageAdapter mainViewPageAdapter) {
        viewPage.setAdapter(mainViewPageAdapter);
    }

    @BindingAdapter({ "upWithViewPage", "tabIcons" })
    public static void setUpWithViewPage(final TabLayout tabLayout, final ViewPager viewPager,
            final MainViewPageAdapter mainViewPageAdapter) {
        tabLayout.setupWithViewPager(viewPager);
        for (int i = 0; i < 2; i++) {
            TabLayout.Tab tab = tabLayout.getTabAt(i);
            tab.setCustomView(mainViewPageAdapter.getTabView(i));
        }
    }
}
