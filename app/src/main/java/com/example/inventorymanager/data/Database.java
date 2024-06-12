package com.example.inventorymanager.data;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.inventorymanager.data.dao.BookDao;
import com.example.inventorymanager.data.entities.BookEntity;
import com.example.inventorymanager.data.entities.DetailsEntity;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
@androidx.room.Database(entities = {BookEntity.class, DetailsEntity.class}, version = 5, exportSchema = true)
public abstract class Database extends RoomDatabase {
    public abstract BookDao BookDAO();

    private static volatile Database INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    public static  final ExecutorService databaseWriteExecutor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    public static Database getDatabase(final Context context){
        if(INSTANCE == null){
            synchronized (Database.class){
                if (INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                                    Database.class,"book_database").fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
