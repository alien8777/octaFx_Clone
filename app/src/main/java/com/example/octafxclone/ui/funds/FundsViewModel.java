package com.example.octafxclone.ui.funds;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class FundsViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private final MutableLiveData<String> mText;

    public FundsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is funds fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}