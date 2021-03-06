package com.hyperion.ths.marvel_03.data.source.remote;

import com.hyperion.ths.marvel_03.data.model.Hero;
import io.reactivex.Observable;
import java.util.List;

/**
 * Created by ths on 30/05/2017.
 */

public interface HeroDataSource {
    /**
     * interface remote.
     */
    interface RemoteDataSource {
        Observable<List<Hero>> getAllCharacters(Long ts, String keyApi, String hash);
    }
}
