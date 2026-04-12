package com.example.bth9;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Phone> list;
    PhoneAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        list = new ArrayList<>();
        list.add(new Phone("iPhone 15", R.mipmap.ic_launcher));
        list.add(new Phone("Samsung S23", R.mipmap.ic_launcher));
        list.add(new Phone("Xiaomi 13", R.mipmap.ic_launcher));
        list.add(new Phone("Oppo Reno", R.mipmap.ic_launcher));

        adapter = new PhoneAdapter(list);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}