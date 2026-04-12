package com.example.bth8;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Phone> list;
    PhoneAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        list = new ArrayList<>();

        list.add(new Phone("iPhone 15", R.mipmap.ic_launcher));
        list.add(new Phone("Samsung S23", R.mipmap.ic_launcher));
        list.add(new Phone("Xiaomi 13", R.mipmap.ic_launcher));
        list.add(new Phone("Oppo Reno", R.mipmap.ic_launcher));

        adapter = new PhoneAdapter(this, list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(this,
                    "Bạn chọn: " + list.get(position).name,
                    Toast.LENGTH_SHORT).show();
        });
    }
}