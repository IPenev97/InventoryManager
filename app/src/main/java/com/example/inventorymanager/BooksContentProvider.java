package com.example.inventorymanager;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.inventorymanager.data.repository.BookRepository;

import java.util.concurrent.ExecutionException;

public class BooksContentProvider extends ContentProvider {
    private BookRepository bookRepository;
    public static final String AUTHORITY = "com.example.inventorymanager.BooksContentProvider";
    public static final String GET_BOOKS_PATH = "books";
    private static final UriMatcher uriMatcher = new UriMatcher(UriMatcher.NO_MATCH);






    static {
        uriMatcher.addURI(AUTHORITY, GET_BOOKS_PATH, 1);
    }


    @Override
    public boolean onCreate() {
        bookRepository = new BookRepository(getContext());
        return true;
    }

    @Nullable
    @Override
    public Cursor query(@NonNull Uri uri, @Nullable String[] strings, @Nullable String s, @Nullable String[] strings1, @Nullable String s1) {
        switch (uriMatcher.match(uri)) {
            case 1:
                try {
                    return bookRepository.getAllBooksWithDetails();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        }
        return null;
    }

    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {
        switch(uriMatcher.match(uri)){
            case 1: return ContentResolver.CURSOR_DIR_BASE_TYPE+"/"+"vnd.com.example.inventorymanager.getbooks";
        }
        return null;
    }

    @Nullable
    @Override
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {

        return null;
    }

    @Override
    public int delete(@NonNull Uri uri, @Nullable String s, @Nullable String[] strings) {
        return 0;
    }

    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String s, @Nullable String[] strings) {
        return 0;
    }
}
