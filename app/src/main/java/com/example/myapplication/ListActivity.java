package com.example.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<ItemModel> items = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            items.add(new ItemModel("Item " + i, "This is the description for item " + i));
        }

        MyAdapter adapter = new MyAdapter(items);
        recyclerView.setAdapter(adapter);
    }
}