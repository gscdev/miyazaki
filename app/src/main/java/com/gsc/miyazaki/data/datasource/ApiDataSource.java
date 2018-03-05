package com.gsc.miyazaki.data.datasource;

import com.gsc.miyazaki.data.response.FilmResponse;
import com.gsc.miyazaki.data.ws.ApiService;

import java.io.IOException;
import java.util.List;

import static com.gsc.miyazaki.data.ws.RestClient.getClient;

public class ApiDataSource implements DataSource {

    @Override
    public List<FilmResponse> getFilms() {
        List<FilmResponse> response = null;
        try {
            response = getClient().create(ApiService.class).getFilms().execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }
}
