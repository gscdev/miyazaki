package com.gsc.miyazaki.model;

public class Film {

    private String title;
    private String year;
    private int duration;
    private String music;
    private String description;
    private String image;

    public Film(String title, String year, int duration, String music, String description, String image) {
        this.title = title;
        this.year = year;
        this.duration = duration;
        this.music = music;
        this.description = description;
        this.image = image;
    }

    //region getters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    //endregion
}
