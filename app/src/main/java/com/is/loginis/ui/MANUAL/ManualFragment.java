package com.is.loginis.ui.MANUAL;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.is.loginis.R;

public class ManualFragment extends Fragment {

    private ManualViewModel manualViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        manualViewModel =
                ViewModelProviders.of(this).get(ManualViewModel.class);
        View root = inflater.inflate(R.layout.fragment_manual, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        manualViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}