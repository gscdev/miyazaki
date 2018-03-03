package com.gsc.miyazaki.ui.films;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.gsc.miyazaki.R;
import com.gsc.miyazaki.model.Film;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FilmsActivity extends AppCompatActivity implements FilmsView {

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

    //region FilmsView
    @Override
    public void setFilms(List<Film> films) {
        filmsList.setAdapter(new FilmsRecyclerViewAdapter(films));
    }
    //endregion
}