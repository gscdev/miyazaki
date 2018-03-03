package com.gsc.miyazaki.ui.films;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gsc.miyazaki.R;

public class FilmsActivity extends AppCompatActivity implements FilmsView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_films);
    }
}
