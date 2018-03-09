package com.gsc.miyazaki.data;

import com.gsc.miyazaki.data.datasource.ApiDataSource;
import com.gsc.miyazaki.data.datasource.DataSource;
import com.gsc.miyazaki.data.mapper.FilmMapper;
import com.gsc.miyazaki.data.response.FilmResponse;
import com.gsc.miyazaki.model.Film;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

public class DataRepository {

    @Inject
    @Singleton
    public DataSource dataSource;
    @Inject
    public FilmMapper filmMapper;


    public DataRepository(ApiDataSource apiDataSource, FilmMapper filmMapper) {
        this.dataSource = apiDataSource;
        this.filmMapper = filmMapper;
    }

    public List<Film> getFilms() {
        List<Film> films = null;
        List<FilmResponse> filmsResponse = dataSource.getFilms();

        if (filmsResponse != null) {
            films = filmMapper.transform(filmsResponse);
        }

        return films;
    }
}
