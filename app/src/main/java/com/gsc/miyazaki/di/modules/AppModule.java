package com.gsc.miyazaki.di.modules;

import android.content.Context;
import android.support.annotation.NonNull;

import com.gsc.miyazaki.ui.films.FilmsPresenter;
import com.gsc.miyazaki.ui.films.detail.FilmDetailPresenter;
import com.gsc.miyazaki.usecase.GetFilms;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private Context context;

    public AppModule(@NonNull Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    public Context provideContext() {
        return context;
    }

    @Provides
    public FilmsPresenter provideFilmsPresenter(GetFilms getFilms) {
        return new FilmsPresenter(getFilms);
    }

    @Provides
    public FilmDetailPresenter provideFilmDetailPresenter() {
        return new FilmDetailPresenter();
    }
}
