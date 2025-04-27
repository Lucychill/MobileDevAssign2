package com.example.mobiledevelopmentassign2;

// class for each menu item with name, description, calories and category for filtering
public class MenuItemAttributes {

    private int imageResource;
    private String name;
    private String description;
    private String calorieCount;
    private String category;

    public MenuItemAttributes(int imageResource, String name, String description, String calorieCount, String category) {
        this.imageResource = imageResource;
        this.name = name;
        this.description = description;
        this.calorieCount = calorieCount;
        this.category = category;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCalorieCount() {
        return calorieCount;
    }

    public String getCategory() {
        return category;
    }
}
