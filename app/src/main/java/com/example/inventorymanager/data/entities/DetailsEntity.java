package com.example.inventorymanager.data.entities;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "details")
public class DetailsEntity{
    @PrimaryKey(autoGenerate = true)

    private int id;


    private String summary;
    private String publishDate;
    private String genre;
    private boolean isFavorite;


    public DetailsEntity(String summary, String publishDate, String genre) {
        this.summary = summary;
        this.publishDate = publishDate;
        this.genre = genre;
        this.isFavorite = false;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }
}
