package com.gsc.miyazaki.ui.films;

import java.util.Collections;

public class FilmsPresenter {

    private FilmsView view;

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
        view.setFilms(Collections.EMPTY_LIST);
    }
}
