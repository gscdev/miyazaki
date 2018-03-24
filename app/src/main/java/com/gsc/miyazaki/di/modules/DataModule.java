package com.gsc.miyazaki.di.modules;

import com.gsc.miyazaki.data.DataRepository;
import com.gsc.miyazaki.data.datasource.ApiDataSource;
import com.gsc.miyazaki.data.mapper.FilmMapper;

import dagger.Module;
import dagger.Provides;

@Module
public class DataModule {

    @Provides
    public DataRepository provideDataRepository(ApiDataSource apiDataSource, FilmMapper filmMapper) {
        return new DataRepository(apiDataSource, filmMapper);
    }

    @Provides
    public ApiDataSource provideApiDataSource() {
        return new ApiDataSource();
    }

    @Provides
    public FilmMapper provideFilmMapper() {
        return new FilmMapper();
    }
}
