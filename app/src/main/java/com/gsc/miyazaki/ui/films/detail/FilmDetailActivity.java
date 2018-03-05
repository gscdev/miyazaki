package com.gsc.miyazaki.ui.films.detail;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.gsc.miyazaki.R;
import com.gsc.miyazaki.model.Film;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FilmDetailActivity extends AppCompatActivity implements FilmDetailView {

    private static final String ARG_FILM = "art_film";

    private FilmDetailPresenter presenter;

    @BindView(R.id.film_detail_appbar)
    AppBarLayout appbar;
    @BindView(R.id.film_detail_collapsing)
    CollapsingToolbarLayout collapsingToolbar;
    @BindView(R.id.film_detail_toolbar)
    Toolbar toolbar;
    @BindView(R.id.film_detail_image)
    ImageView image;
    @BindView(R.id.film_detail_year)
    TextView year;
    @BindView(R.id.film_detail_duration)
    TextView duration;
    @BindView(R.id.film_detail_director)
    TextView director;
    @BindView(R.id.film_detail_writer)
    TextView writer;
    @BindView(R.id.film_detail_description)
    TextView description;


    public static void open(Context context, Film film) {
        Intent intent = new Intent(context, FilmDetailActivity.class);
        intent.putExtra(ARG_FILM, film);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film_detail);
        ButterKnife.bind(this);

        setupActionBar();

        presenter = new FilmDetailPresenter();
        presenter.setView(this);
        presenter.create(getIntent().getParcelableExtra(ARG_FILM));
    }


    private void setupActionBar() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setNavigationOnClickListener(view -> onBackPressed());
    }

    //region FilmDetailView
    @Override
    public void setToolbarTitle(String title) {
        toolbar.setTitle(title);
        collapsingToolbar.setTitle(title);
    }

    @Override
    public void setFilmInfo(Film film) {
        Picasso.with(this).load(film.getImage()).into(image);
        director.setText(film.getDirector());
        writer.setText(film.getWriter());
        year.setText(film.getYear());
        duration.setText(film.getDuration() + getString(R.string.minutes));
        description.setText(film.getDescription());
    }
    //endregion
}
