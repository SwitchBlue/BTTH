package thigk2.hoxuanphuc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class chucnang1 extends AppCompatActivity {

    private EditText etVND, etUSD;
    private final double CONVERSION_RATE = 25000.0; // 1 USD = 25,000 VND

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chucnang1);

        etVND = findViewById(R.id.etVND);
        etUSD = findViewById(R.id.etUSD);
        Button btnVNDtoUSD = findViewById(R.id.btnVNDtoUSD);
        Button btnUSDtoVND = findViewById(R.id.btnUSDtoVND);
        Button btnBack = findViewById(R.id.btnBack);

        btnVNDtoUSD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String vndStr = etVND.getText().toString();
                if (!vndStr.isEmpty()) {
                    try {
                        double vnd = Double.parseDouble(vndStr);
                        double usd = vnd / CONVERSION_RATE;
                        etUSD.setText(String.format(Locale.US, "%.2f", usd));
                    } catch (NumberFormatException e) {
                        Toast.makeText(chucnang1.this, "Invalid input", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        btnUSDtoVND.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usdStr = etUSD.getText().toString();
                if (!usdStr.isEmpty()) {
                    try {
                        double usd = Double.parseDouble(usdStr);
                        double vnd = usd * CONVERSION_RATE;
                        etVND.setText(String.format(Locale.US, "%.0f", vnd));
                    } catch (NumberFormatException e) {
                        Toast.makeText(chucnang1.this, "Invalid input", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}