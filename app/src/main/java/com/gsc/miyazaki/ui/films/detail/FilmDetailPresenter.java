package com.gsc.miyazaki.ui.films.detail;

import com.gsc.miyazaki.model.Film;

public class FilmDetailPresenter {

    private FilmDetailView view;

    public void setView(FilmDetailView view) {
        this.view = view;
    }

    public void create(Film film) {
        view.setToolbarTitle(film.getTitle());
        view.setFilmInfo(film);
    }
}
