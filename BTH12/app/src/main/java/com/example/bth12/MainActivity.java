package com.example.bth12;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {

    Button btn;
    boolean isA = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btnChange);

        // hiển thị fragment đầu tiên
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.frameLayout, new FragmentA())
                .commit();

        btn.setOnClickListener(v -> {
            Fragment fragment;

            if (isA) {
                fragment = new FragmentB();
            } else {
                fragment = new FragmentA();
            }

            isA = !isA;

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frameLayout, fragment)
                    .commit();
        });
    }
}