package com.example.octafxclone.ui.invest;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class InvestViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private final MutableLiveData<String> mText;

    public InvestViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is invest fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}