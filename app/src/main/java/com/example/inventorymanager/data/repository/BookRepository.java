package com.example.inventorymanager.data.repository;

import android.content.Context;
import android.database.Cursor;

import com.example.inventorymanager.data.Database;
import com.example.inventorymanager.data.dao.BookDao;
import com.example.inventorymanager.data.entities.BookEntity;
import com.example.inventorymanager.data.entities.DetailsEntity;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class BookRepository {



    private BookDao bookDao;

    public BookRepository(Context context) {
        Database db = Database.getDatabase(context);
        bookDao = db.BookDAO();
    }

    public Cursor getAllBooksWithDetails() throws ExecutionException, InterruptedException {
        Future<Cursor> listBookAndDetails =  Database
                .databaseWriteExecutor.submit(() -> bookDao.getAllBooksCursor());

        //GET SHOULD WAIT UNTIL WE GET WHAT WE WANT
        return listBookAndDetails.get();
    }

    public DetailsEntity getDetailsForBook(int detailsId) throws ExecutionException, InterruptedException {

        Future<DetailsEntity>detailsEntity = Database.databaseWriteExecutor.submit(() -> bookDao.getDetailsForBook(detailsId));
        return detailsEntity.get();
    }
    public List<BookEntity>getAllBooks() throws ExecutionException, InterruptedException {
        Future<List<BookEntity>> listBookAndDetails =  Database
                .databaseWriteExecutor.submit(() -> bookDao.getAll());

        //GET SHOULD WAIT UNTIL WE GET WHAT WE WANT
        return listBookAndDetails.get();
    }

    public long[] insertBooks(List<BookEntity>bookList) throws ExecutionException, InterruptedException {
        Future<long[]> insertSuccessful = Database.databaseWriteExecutor.submit(() -> bookDao.insertBook(bookList));
        return insertSuccessful.get();
    }

    public void insertDetails(List<DetailsEntity> details) {
        Database.databaseWriteExecutor.submit(() -> bookDao.insertDetails(details));
    }

    public void setBookFavorite(int id, boolean favorite){
       Database.databaseWriteExecutor.submit(() -> bookDao.addBookToFavorite(id, favorite));
    }
}
