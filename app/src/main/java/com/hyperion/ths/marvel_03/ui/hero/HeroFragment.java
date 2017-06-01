package com.hyperion.ths.marvel_03.ui.hero;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.hyperion.ths.marvel_03.R;
import com.hyperion.ths.marvel_03.data.source.remote.HeroRepository;
import com.hyperion.ths.marvel_03.data.source.remote.api.HeroRemoteDataSource;
import com.hyperion.ths.marvel_03.data.source.remote.api.service.MarvelServiceClient;
import com.hyperion.ths.marvel_03.databinding.FragmentHeroBinding;
import com.hyperion.ths.marvel_03.utils.rx.SchedulerProvider;

/**
 * A simple {@link Fragment} subclass.
 */
public class HeroFragment extends Fragment {

    public HeroFragment() {
    }

    private HeroViewModel mHeroViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        FragmentHeroBinding fragmentHeroBinding =
                DataBindingUtil.inflate(inflater, R.layout.fragment_hero, container, false);
        HeroRepository heroRepository =
                new HeroRepository(new HeroRemoteDataSource(MarvelServiceClient.getInstance()));

        mHeroViewModel = new HeroViewModel(heroRepository);

        mHeroViewModel.setBaseSchedulerProvider(SchedulerProvider.getInstance());

        View view = fragmentHeroBinding.getRoot();

        fragmentHeroBinding.setViewModel(mHeroViewModel);

        return view;
    }

    @Override
    public void onStop() {
        super.onStop();
        mHeroViewModel.onStop();
    }
}
