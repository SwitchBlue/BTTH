package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] subjects = {
            "Lập trình Java",
            "Cấu trúc dữ liệu",
            "Hệ điều hành",
            "Mạng máy tính",
            "Trí tuệ nhân tạo"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        // Adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                subjects
        );

        listView.setAdapter(adapter);

        // Click item
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selected = subjects[position];
                Toast.makeText(MainActivity.this,
                        "Bạn chọn: " + selected,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}