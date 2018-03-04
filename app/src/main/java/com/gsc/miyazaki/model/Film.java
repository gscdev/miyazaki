package com.gsc.miyazaki.model;

public class Film {

    private String title;
    private String year;
    private String duration;
    private String director;
    private String writer;
    private String description;
    private String image;

    public Film(String title, String year, String duration, String director, String writer,
                String description, String image) {
        this.title = title;
        this.year = year;
        this.duration = duration;
        this.director = director;
        this.writer = writer;
        this.description = description;
        this.image = image;
    }

    //region getters
    public String getTitle() {
        return title;
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

    public String getImage() {
        return image;
    }
    //endregion
}
