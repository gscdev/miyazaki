package com.gsc.miyazaki.usecase;

import android.os.Handler;
import android.os.Looper;

import com.gsc.miyazaki.data.DataRepository;
import com.gsc.miyazaki.model.Film;

import java.util.List;

public class GetFilms {

    private DataRepository dataRepository;

    public GetFilms() {
        dataRepository = new DataRepository();
    }

    public void getData(Callback callback) {
        new Thread(() -> loadFilms(callback)).start();
    }

    private void loadFilms(Callback callback) {
        List<Film> films = dataRepository.getFilms();

        new Handler(Looper.getMainLooper()).post(() -> {
            if (films == null) {
                callback.onErrorGetFilms();
            } else {
                callback.onSuccessGetFilms(films);
            }
        });
    }

    public interface Callback {
        void onSuccessGetFilms(List<Film> films);

        void onErrorGetFilms();
    }
}
