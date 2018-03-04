package com.gsc.miyazaki.ui.films;

import com.gsc.miyazaki.model.Film;
import com.gsc.miyazaki.usecase.GetFilms;

import java.util.List;

public class FilmsPresenter {

    private GetFilms getFilms;
    private FilmsView view;

    public FilmsPresenter() {
        getFilms = new GetFilms();
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
            public void onSuccessGetFilms(List<Film> films) {
                view.setFilms(films);
            }

            @Override
            public void onErrorGetFilms() {
            }
        });
    }
}
