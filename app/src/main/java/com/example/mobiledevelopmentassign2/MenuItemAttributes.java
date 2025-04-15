package com.example.mobiledevelopmentassign2;

public class MenuItemAttributes {
    private int imageResource;
    private String name;
    private String calories;

    public MenuItemAttributes(int imageResource, String name, String calories) {
        this.imageResource = imageResource;
        this.name = name;
        this.calories = calories;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getName() {
        return name;
    }

    public String getCalories() {
        return calories;
    }
}