package com.example.inventorymanager;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;


import androidx.annotation.Nullable;

import com.example.inventorymanager.data.entities.DetailsEntity;
import com.example.inventorymanager.data.repository.BookRepository;

import java.util.concurrent.ExecutionException;

public class AidlBookService extends Service {

    private BookRepository bookRepository;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        bookRepository = new BookRepository(this);
        return binder;
    }

    private InventoryManagerAIDL.Stub binder = new InventoryManagerAIDL.Stub() {
        @Override
        public DetailsAIDL getBookAndDetails(int id) throws RemoteException {
            try {
                DetailsEntity details = bookRepository.getDetailsForBook(id);
                DetailsAIDL detailsAIDL = new DetailsAIDL();
                detailsAIDL.id = details.getId();
                detailsAIDL.bookId = id;
                detailsAIDL.genre = details.getGenre();
                detailsAIDL.summary = details.getSummary();
                detailsAIDL.publishDate = details.getPublishDate();
                if(details.isFavorite())
                    detailsAIDL.isFavorite = 1;
                else
                    detailsAIDL.isFavorite = 0;

                return detailsAIDL;
            } catch (ExecutionException e) {
                e.printStackTrace();
                return null;
            } catch (InterruptedException e) {
                e.printStackTrace();
                return null;
            }

        }

        @Override
        public void setBookFavorite(int id, boolean favorite) throws RemoteException {
            bookRepository.setBookFavorite(id, favorite);
        }


    };
}
