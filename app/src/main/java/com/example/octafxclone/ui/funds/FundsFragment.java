package com.example.octafxclone.ui.funds;

import android.arch.lifecycle.ViewModelProvider;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.octafxclone.R;
import com.example.octafxclone.databinding.FragmentFundsBinding;
import com.example.octafxclone.databinding.FragmentOrdersBinding;
import com.example.octafxclone.ui.orders.OrdersViewModel;

public class FundsFragment extends Fragment {

    private FragmentFundsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        FundsViewModel fundsViewModel =
                new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(FundsViewModel.class);

        binding = FragmentFundsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textFunds;
        fundsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}