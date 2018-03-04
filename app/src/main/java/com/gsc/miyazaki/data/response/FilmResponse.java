package com.gsc.miyazaki.data.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FilmResponse {

    @SerializedName("title")
    public String title;
    @SerializedName("image")
    public String image;
    @SerializedName("year")
    public String year;
    @SerializedName("duration")
    public String duration;
    @SerializedName("director")
    public String director;
    @SerializedName("writer")
    public String writer;
    @SerializedName("description")
    public String description;


    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public String getYear() {
        return year;
    }

    public String getDuration() {
        return duration;
    }

    public String getDirector() {
        return director;
    }

    public String getWriter() {
        return writer;
    }

    public String getDescription() {
        return description;
    }
}
