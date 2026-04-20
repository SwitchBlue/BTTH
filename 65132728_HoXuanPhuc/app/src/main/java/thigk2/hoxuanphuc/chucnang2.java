package thigk2.hoxuanphuc;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class chucnang2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chucnang2);

        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ListView lvSongs = findViewById(R.id.lvSongs);

        List<String> songNames = new ArrayList<>();
        songNames.add("Tiến Quân Ca");
        songNames.add("Giải phóng Miền Nam");
        songNames.add("Cô gái vót chông");
        songNames.add("Hát về cây súng");
        songNames.add("Trường Sơn Đông Trường Sơn Tây");
        songNames.add("Huyền thoại mẹ");
        songNames.add("Tiểu đội xe không kính");
        songNames.add("Bác đang cùng chúng cháu hành quân");
        songNames.add("Hồ Xuân Phúc");
        songNames.add("Như có Bác trong ngày đại thắng");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, songNames);
        lvSongs.setAdapter(adapter);
    }
}