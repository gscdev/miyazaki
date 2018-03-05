package com.gsc.miyazaki.data.mapper;

import com.gsc.miyazaki.data.response.FilmResponse;
import com.gsc.miyazaki.model.Film;

import static com.gsc.miyazaki.data.Constants.IMAGES_PATH;

public class FilmMapper extends BaseMapper<Film, FilmResponse> {

    @Override
    Film transform(FilmResponse filmsResponse) {
        return new Film(
                filmsResponse.getTitle(),
                filmsResponse.getYear(),
                filmsResponse.getDuration(),
                filmsResponse.getDirector(),
                filmsResponse.getWriter(),
                filmsResponse.getDescription(),
                IMAGES_PATH + filmsResponse.getImage());
    }
}
