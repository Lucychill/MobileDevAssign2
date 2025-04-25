package com.example.mobiledevelopmentassign2;

import java.util.ArrayList;
import java.util.List;

public class CalorieTracker {
    private static final ArrayList<CalorieItem> items = new ArrayList<>();

    public static void addItem(CalorieItem item) {
        items.add(item);
    }

    public static ArrayList<CalorieItem> getItems() {
        return items;
    }

    public static int getTotalCalories() {
        int total = 0;
        for (CalorieItem item : items) {
            total += item.getCalories();
        }
        return total;
    }

    public static void clearItems() {
        items.clear();
    }
}

