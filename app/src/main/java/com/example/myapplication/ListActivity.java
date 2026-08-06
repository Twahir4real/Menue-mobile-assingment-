package com.example.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
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

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<ItemModel> items = new ArrayList<>();
        items.add(new ItemModel("Pepperoni Pizza", "Cheesy pepperoni pizza with a crispy thin crust."));
        items.add(new ItemModel("Beef Burger", "Juicy beef patty with lettuce, tomato, and secret sauce."));
        items.add(new ItemModel("Salmon Sushi", "Fresh salmon and avocado rolls served with ginger."));
        items.add(new ItemModel("Chicken Alfredo", "Creamy pasta with grilled chicken and parmesan cheese."));
        items.add(new ItemModel("Greek Salad", "Fresh cucumbers, tomatoes, olives, and feta cheese."));
        items.add(new ItemModel("Spicy Tacos", "Three beef tacos with spicy salsa and fresh lime."));
        items.add(new ItemModel("Grilled Steak", "Perfectly seared sirloin with garlic herb butter."));
        items.add(new ItemModel("Club Sandwich", "Triple-decker with turkey, bacon, and mayonnaise."));
        items.add(new ItemModel("Tomato Soup", "Warm tomato basil soup served with crunchy croutons."));
        items.add(new ItemModel("Chocolate Sundae", "Vanilla ice cream with hot fudge and a cherry on top."));
        items.add(new ItemModel("Fish and Chips", "Crispy battered cod served with golden fries."));
        items.add(new ItemModel("Vegetable Stir-fry", "Fresh garden veggies tossed in a savory soy sauce."));
        items.add(new ItemModel("Pancakes", "Fluffy buttermilk pancakes with maple syrup."));
        items.add(new ItemModel("BBQ Ribs", "Slow-cooked ribs glazed in a smoky BBQ sauce."));
        items.add(new ItemModel("Caesar Salad", "Romaine lettuce, croutons, and Caesar dressing."));

        MyAdapter adapter = new MyAdapter(items);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}