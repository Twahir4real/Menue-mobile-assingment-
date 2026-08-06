package com.example.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        MaterialToolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle(R.string.list_title);
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.list_layout), (v, windowInsets) -> {
            Insets systemBars = windowInsets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return windowInsets;
        });

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<ItemModel> items = new ArrayList<>();
        items.add(new ItemModel("Harley-Davidson", ""));
        items.add(new ItemModel("Ducati", ""));
        items.add(new ItemModel("BMW Motorrad", ""));
        items.add(new ItemModel("Yamaha", ""));
        items.add(new ItemModel("Kawasaki", ""));
        items.add(new ItemModel("Honda", ""));
        items.add(new ItemModel("Suzuki", ""));
        items.add(new ItemModel("Triumph", ""));
        items.add(new ItemModel("KTM", ""));
        items.add(new ItemModel("Aprilia", ""));

        MyAdapter adapter = new MyAdapter(items);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}