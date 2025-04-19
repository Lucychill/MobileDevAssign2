package com.example.mobiledevelopmentassign2;

public class MenuItemAttributes {
    private int imageResource;
    private String name;
    private String calorieCount;
    private String category; // 🔥 new field

    public MenuItemAttributes(int imageResource, String name, String calorieCount, String category) {
        this.imageResource = imageResource;
        this.name = name;
        this.calorieCount = calorieCount;
        this.category = category; // ✅ set category
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getName() {
        return name;
    }

    public String getCalorieCount() {
        return calorieCount;
    }

    public String getCategory() {
        return category; // ✅ getter
    }
}