package com.example.inventorymanager.data.dao;

import android.database.Cursor;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.inventorymanager.data.entities.BookAndDetails;
import com.example.inventorymanager.data.entities.BookEntity;
import com.example.inventorymanager.data.entities.DetailsEntity;


import java.util.List;

@Dao
public interface BookDao {
    @Query("SELECT * FROM book")
    public List<BookEntity> getAll ();
    @Query("SELECT * FROM book")
    public List<BookAndDetails>getAllWithDetails();

    @Query("SELECT * FROM book")
    public Cursor getAllBooksCursor();
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public long[] insertBook(List<BookEntity>bookEntities);

    @Query("SELECT * FROM details WHERE id=:id")
    public DetailsEntity getDetailsForBook(int id);
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertDetails(List<DetailsEntity> details);
    @Query("UPDATE details SET isFavorite = :favorite WHERE id=:id")
    public void addBookToFavorite(int id, boolean favorite);


}
