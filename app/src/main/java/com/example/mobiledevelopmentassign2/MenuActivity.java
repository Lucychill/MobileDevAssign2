package com.example.mobiledevelopmentassign2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerViewAdapter adapter;
    private List<MenuItemAttributes> menuItemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2)); // 2 columns

        menuItemList = new ArrayList<>();
        menuItemList.add(new MenuItemAttributes(R.drawable.chicken_fried_rice, "Chicken Fried Rice", "520 kcal"));
        menuItemList.add(new MenuItemAttributes(R.drawable.veggie_wellington, "Veggie Wellington", "460 kcal"));
        menuItemList.add(new MenuItemAttributes(R.drawable.chicken_salad, "Chicken Salad", "350 kcal"));
        menuItemList.add(new MenuItemAttributes(R.drawable.avocado_side_salad, "Avocado Side Salad", "290 kcal"));
        menuItemList.add(new MenuItemAttributes(R.drawable.grilled_carrots, "Grilled Carrots", "120 kcal"));
        menuItemList.add(new MenuItemAttributes(R.drawable.vegetable_soup, "Vegetable Soup", "150 kcal"));
        menuItemList.add(new MenuItemAttributes(R.drawable.angel_food_cake_with_oranges, "Angel Food Cake with Oranges", "280 kcal"));
        menuItemList.add(new MenuItemAttributes(R.drawable.vegetable_pudding, "Vegetable Pudding", "300 kcal"));
        menuItemList.add(new MenuItemAttributes(R.drawable.yogurt_dessert, "Yogurt Dessert", "200 kcal"));


        adapter = new RecyclerViewAdapter(this, menuItemList);
        recyclerView.setAdapter(adapter);
    }
}
