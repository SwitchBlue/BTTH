package com.example.bth11;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class ResultFragment extends Fragment {

    TextView txt;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_result, container, false);
        txt = view.findViewById(R.id.txtResult);
        return view;
    }

    public void updateResult(int result) {
        txt.setText("Kết quả: " + result);
    }
}