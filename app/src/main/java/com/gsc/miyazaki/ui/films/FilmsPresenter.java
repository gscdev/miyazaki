package com.gsc.miyazaki.ui.films;

import com.gsc.miyazaki.model.Film;
import com.gsc.miyazaki.usecase.GetFilms;

import java.util.List;

public class FilmsPresenter {

    private GetFilms getFilms;
    private FilmsView view;
    private List<Film> films;

    public FilmsPresenter(GetFilms getFilms) {
        this.getFilms = getFilms;
    }

    public void setView(FilmsView view) {
        this.view = view;
    }

    public void onCreate() {
        loadFilms();
    }

    public void onDestroy() {
        view = null;
    }

    private void loadFilms() {
        getFilms.getData(new GetFilms.Callback() {
            @Override
            public void onSuccessGetFilms(List<Film> filmList) {
                films = filmList;
                view.setFilms(films);
            }

            @Override
            public void onErrorGetFilms() {
            }
        });
    }

    public void onFilmSelected(int position) {
        view.navigateToFilmDetail(films.get(position));
    }
}
