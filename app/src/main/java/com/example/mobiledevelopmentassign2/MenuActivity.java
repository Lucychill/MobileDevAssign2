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
        menuItemList.add(new MenuItemAttributes(R.drawable.chicken_fried_rice));
        menuItemList.add(new MenuItemAttributes(R.drawable.veggie_wellington));
        menuItemList.add(new MenuItemAttributes(R.drawable.chicken_salad));
        menuItemList.add(new MenuItemAttributes(R.drawable.avocado_side_salad));
        menuItemList.add(new MenuItemAttributes(R.drawable.grilled_carrots));
        menuItemList.add(new MenuItemAttributes(R.drawable.vegetable_soup));
        menuItemList.add(new MenuItemAttributes(R.drawable.angel_food_cake_with_oranges));
        menuItemList.add(new MenuItemAttributes(R.drawable.vegetable_pudding));
        menuItemList.add(new MenuItemAttributes(R.drawable.yogurt_dessert));

        adapter = new RecyclerViewAdapter(this, menuItemList);
        recyclerView.setAdapter(adapter);
    }
}
