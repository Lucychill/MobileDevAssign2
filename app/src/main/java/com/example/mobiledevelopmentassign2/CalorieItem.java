package com.example.mobiledevelopmentassign2;

public class CalorieItem {
    private final String name;
    private final int calories;

    public CalorieItem(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }
}

