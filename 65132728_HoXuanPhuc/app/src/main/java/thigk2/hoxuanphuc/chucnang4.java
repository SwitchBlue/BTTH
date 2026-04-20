package thigk2.hoxuanphuc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import thigk2.hoxuanphuc.databinding.ActivityChucnang4Binding;

public class chucnang4 extends AppCompatActivity {

    private ActivityChucnang4Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityChucnang4Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        // Access views from the included content layout
        View contentView = findViewById(R.id.main_content);
        
        Button btnBack = findViewById(R.id.btnBack);
        if (btnBack != null) {
            btnBack.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }

        RecyclerView rvStudents = findViewById(R.id.rvStudents);
        if (rvStudents != null) {
            rvStudents.setLayoutManager(new LinearLayoutManager(this));

            List<Student> studentList = new ArrayList<>();
            // Updated to use images sv1, sv2, and sv3 from drawable
            studentList.add(new Student("Hồ Xuân Phúc", "65.CNTT-2", "Nha Trang, Khánh Hòa", R.drawable.sv1));
            studentList.add(new Student("Nguyễn Văn A", "65.CNTT-1", "Cam Ranh, Khánh Hòa", R.drawable.sv2));
            studentList.add(new Student("Trần Thị B", "64.KTPM-1", "Diên Khánh, Khánh Hòa", R.drawable.sv3));

            StudentAdapter adapter = new StudentAdapter(studentList);
            rvStudents.setAdapter(adapter);
        }

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}