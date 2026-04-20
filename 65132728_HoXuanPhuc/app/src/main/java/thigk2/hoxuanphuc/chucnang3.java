package thigk2.hoxuanphuc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class chucnang3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chucnang3);

        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        RecyclerView rvFigures = findViewById(R.id.rvFigures);
        rvFigures.setLayoutManager(new LinearLayoutManager(this));

        List<HistoricalFigure> figureList = new ArrayList<>();
        // Updated to use your images from the drawable folder
        figureList.add(new HistoricalFigure("Hồ Chí Minh", "Nghệ An", R.drawable.hcm));
        figureList.add(new HistoricalFigure("Võ Nguyên Giáp", "Quảng Bình", R.drawable.vonguyengiap));
        figureList.add(new HistoricalFigure("Trần Hưng Đạo", "Nam Định", R.drawable.tranhungdao));
        figureList.add(new HistoricalFigure("Ngô Quyền", "Hà Nội", R.drawable.ngoquyen));
        figureList.add(new HistoricalFigure("Quang Trung", "Bình Định", R.drawable.quangtrung));

        FigureAdapter adapter = new FigureAdapter(figureList);
        rvFigures.setAdapter(adapter);
    }
}