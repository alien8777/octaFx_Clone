package com.example.octafxclone.ui.watchlist;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class WatchListViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public WatchListViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is watchlist fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}