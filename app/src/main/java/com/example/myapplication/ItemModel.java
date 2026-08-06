package com.example.myapplication;

public class ItemModel {
    private final String title;
    private final String description;

    public ItemModel(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}