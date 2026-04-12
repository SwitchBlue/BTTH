package com.example.bth12;

import android.os.Bundle;
import android.view.*;
import androidx.fragment.app.Fragment;

public class FragmentB extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_b, container, false);
    }
}