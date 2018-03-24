package com.gsc.miyazaki.di.components;

import com.gsc.miyazaki.di.modules.AppModule;
import com.gsc.miyazaki.di.modules.DataModule;
import com.gsc.miyazaki.ui.films.FilmsActivity;
import com.gsc.miyazaki.ui.films.detail.FilmDetailActivity;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {AppModule.class, DataModule.class})
@Singleton
public interface AppComponent {

    void inject(FilmsActivity filmsActivity);

    void inject(FilmDetailActivity filmDetailActivity);
}
