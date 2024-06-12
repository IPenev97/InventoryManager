package com.example.inventorymanager.data.entities;

import androidx.room.Embedded;
import androidx.room.Relation;

public class BookAndDetails {

    @Relation(parentColumn = "id", entityColumn = "detailsId")
    private BookEntity book;

   @Embedded
    private DetailsEntity details;

    public BookAndDetails(BookEntity book, DetailsEntity details) {
        this.book = book;
        this.details = details;
    }

    public BookEntity getBook() {
        return book;
    }

    public void setBook(BookEntity book) {
        this.book = book;
    }

    public DetailsEntity getDetails() {
        return details;
    }

    public void setDetails(DetailsEntity details) {
        this.details = details;
    }


}
