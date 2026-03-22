package com.example.lab02_2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText num1, num2;
    private Button btnSum,btnMul,btnDiv1,btnSub;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        btnSum = findViewById(R.id.btnSum);
        result = findViewById(R.id.result);
        btnMul = findViewById(R.id.btnMul);
        btnDiv1 = findViewById(R.id.btnDiv1);
        btnSub = findViewById(R.id.btnSub);



        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = num1.getText().toString();
                String str2 = num2.getText().toString();

                if (str1.isEmpty() || str2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Vui lòng nhập đầy đủ hai số", Toast.LENGTH_SHORT).show();
                    return;
                }

                try {
                    int a = Integer.parseInt(str1);
                    int b = Integer.parseInt(str2);
                    int sum = a + b;
                    result.setText(getString(R.string.result_text, sum));
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "Định dạng số không hợp lệ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = num1.getText().toString();
                String str2 = num2.getText().toString();

                if (str1.isEmpty() || str2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Vui lòng nhập đầy đủ hai số", Toast.LENGTH_SHORT).show();
                    return;
                }

                try {
                    int a = Integer.parseInt(str1);
                    int b = Integer.parseInt(str2);
                    int mul = a * b;
                    result.setText(getString(R.string.result_text, mul));
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "Định dạng số không hợp lệ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = num1.getText().toString();
                String str2 = num2.getText().toString();

                if (str1.isEmpty() || str2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Vui lòng nhập đầy đủ hai số", Toast.LENGTH_SHORT).show();
                    return;
                }

                try {
                    int a = Integer.parseInt(str1);
                    int b = Integer.parseInt(str2);
                    int sum = a - b;
                    result.setText(getString(R.string.result_text, sum));
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "Định dạng số không hợp lệ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnDiv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = num1.getText().toString();
                String str2 = num2.getText().toString();

                if (str1.isEmpty() || str2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Vui lòng nhập đầy đủ hai số", Toast.LENGTH_SHORT).show();
                    return;
                }

                try {
                    int a = Integer.parseInt(str1);
                    int b = Integer.parseInt(str2);
                    int sum = a / b;
                    result.setText(getString(R.string.result_text, sum));
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "Định dạng số không hợp lệ", Toast.LENGTH_SHORT).show();
                }
            }
        });

}}

