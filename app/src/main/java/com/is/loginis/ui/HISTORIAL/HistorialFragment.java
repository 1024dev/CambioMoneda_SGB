package com.is.loginis.ui.HISTORIAL;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.is.loginis.R;

import java.util.ArrayList;
import java.util.List;

public class HistorialFragment extends Fragment {


    private HistorialViewModel historialViewModel;

    List<ListElement> elements;
    private TextView mTextViewEmpty;
    private ImageView mImageViewEmpty;
    private RecyclerView rv;
    ListAdapter la;
    View view;

    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_historial, container, false);
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        rv = (RecyclerView) view.findViewById(R.id.recyclerviewListado);

        elements = new ArrayList<>();
        elements.add(new ListElement("#00796B","Chile","10.000 CLP","USA","13 USD"));
        elements.add(new ListElement("#00746B","Peru", "10.000 CLP","USA","13 USD"));
        la = new ListAdapter(elements,getContext());

        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);
        rv.setAdapter(la);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

}