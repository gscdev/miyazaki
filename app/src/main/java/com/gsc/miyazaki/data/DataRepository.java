package com.gsc.miyazaki.data;

import com.gsc.miyazaki.data.datasource.ApiDataSource;
import com.gsc.miyazaki.data.datasource.DataSource;
import com.gsc.miyazaki.data.mapper.FilmMapper;
import com.gsc.miyazaki.data.response.FilmResponse;
import com.gsc.miyazaki.model.Film;

import java.util.List;

public class DataRepository {

    private final DataSource dataSource;
    private final FilmMapper filmMapper;

    public DataRepository() {
        dataSource = new ApiDataSource();
        filmMapper = new FilmMapper();
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
