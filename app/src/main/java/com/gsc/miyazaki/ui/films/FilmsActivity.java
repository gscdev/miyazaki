package com.gsc.miyazaki.ui.films;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.gsc.miyazaki.R;
import com.gsc.miyazaki.model.Film;
import com.gsc.miyazaki.ui.base.OnBaseItemListener;
import com.gsc.miyazaki.ui.films.detail.FilmDetailActivity;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FilmsActivity extends AppCompatActivity implements FilmsView, OnBaseItemListener {

    private FilmsPresenter presenter;

    @BindView(R.id.films_list)
    RecyclerView filmsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_films);
        ButterKnife.bind(this);

        setupView();

        presenter = new FilmsPresenter();
        presenter.setView(this);
        presenter.onCreate();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }

    private void setupView() {
        filmsList.setLayoutManager(new GridLayoutManager(this, 2));
    }

    //region OnBaseItemListener
    @Override
    public void onItemClick(int position) {
        presenter.onFilmSelected(position);
    }
    //endregion

    //region FilmsView
    @Override
    public void setFilms(List<Film> films) {
        filmsList.setAdapter(new FilmsRecyclerViewAdapter(films, this));
    }

    @Override
    public void navigateToFilmDetail(Film film) {
        FilmDetailActivity.open(this, film);
    }
    //endregion
}