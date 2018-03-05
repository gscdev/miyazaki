package com.gsc.miyazaki.ui.films.detail;

import com.gsc.miyazaki.model.Film;

public interface FilmDetailView {

    void setToolbarTitle(String title);

    void setFilmInfo(Film film);
}
