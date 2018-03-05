package com.gsc.miyazaki.data.datasource;

import com.gsc.miyazaki.data.response.FilmResponse;

import java.util.List;

public interface DataSource {

    List<FilmResponse> getFilms();
}
