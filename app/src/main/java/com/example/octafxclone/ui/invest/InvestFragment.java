package com.example.octafxclone.ui.invest;

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
import com.example.octafxclone.databinding.FragmentInvestBinding;
import com.example.octafxclone.ui.funds.FundsViewModel;

public class InvestFragment extends Fragment {

    private FragmentInvestBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        InvestViewModel investViewModel =
                new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(InvestViewModel.class);

        binding = FragmentInvestBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textInvest;
        investViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}