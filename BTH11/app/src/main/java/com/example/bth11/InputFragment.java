package com.example.bth11;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

import androidx.fragment.app.Fragment;

public class InputFragment extends Fragment {

    EditText num1, num2;
    Button btn;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_input, container, false);

        num1 = view.findViewById(R.id.num1);
        num2 = view.findViewById(R.id.num2);
        btn = view.findViewById(R.id.btnSum);

        btn.setOnClickListener(v -> {
            int a = Integer.parseInt(num1.getText().toString());
            int b = Integer.parseInt(num2.getText().toString());
            int sum = a + b;

            ResultFragment resultFragment =
                    (ResultFragment) getActivity()
                            .getSupportFragmentManager()
                            .findFragmentById(R.id.resultFragment);

            resultFragment.updateResult(sum);
        });

        return view;
    }
}