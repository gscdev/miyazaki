package com.gsc.miyazaki.data.ws;

import com.gsc.miyazaki.data.response.FilmResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("art/films")
    Call<List<FilmResponse>> getFilms();
}
