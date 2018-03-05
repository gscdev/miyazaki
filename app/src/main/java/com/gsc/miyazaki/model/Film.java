package com.gsc.miyazaki.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Film implements Parcelable {

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

    protected Film(Parcel in) {
        title = in.readString();
        year = in.readString();
        duration = in.readString();
        director = in.readString();
        writer = in.readString();
        description = in.readString();
        image = in.readString();
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

    //region Parcelable
    public static final Creator<Film> CREATOR = new Creator<Film>() {
        @Override
        public Film createFromParcel(Parcel in) {
            return new Film(in);
        }

        @Override
        public Film[] newArray(int size) {
            return new Film[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeString(year);
        parcel.writeString(duration);
        parcel.writeString(director);
        parcel.writeString(writer);
        parcel.writeString(description);
        parcel.writeString(image);
    }
    //endregion
}
