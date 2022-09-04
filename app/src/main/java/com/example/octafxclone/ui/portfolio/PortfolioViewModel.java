package com.example.octafxclone.ui.portfolio;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class PortfolioViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public PortfolioViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is portfolio fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}