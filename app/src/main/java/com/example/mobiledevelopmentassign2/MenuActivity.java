package com.example.mobiledevelopmentassign2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3)); // 2 columns

        menuItemList = new ArrayList<>();
        menuItemList.add(new MenuItemAttributes(
                R.drawable.chicken_fried_rice,
                "Chicken Fried Rice",
                "A tasty stir-fry with seasoned chicken, rice, and vegetables.",
                "520 kcal",
                "Main"
        ));

        menuItemList.add(new MenuItemAttributes(
                R.drawable.veggie_wellington,
                "Veggie Wellington",
                "A flaky pastry filled with a delicious mix of seasoned vegetables.",
                "460 kcal",
                "Main"
        ));

        menuItemList.add(new MenuItemAttributes(
                R.drawable.chicken_salad,
                "Chicken Salad",
                "Grilled chicken served over fresh greens and light vinaigrette.",
                "350 kcal",
                "Main"
        ));

        menuItemList.add(new MenuItemAttributes(
                R.drawable.avocado_side_salad,
                "Avocado Side Salad",
                "Creamy avocado with crisp lettuce and cherry tomatoes.",
                "290 kcal",
                "Starter"
        ));

        menuItemList.add(new MenuItemAttributes(
                R.drawable.grilled_carrots,
                "Grilled Carrots",
                "Sweet carrots grilled to perfection with a hint of herbs.",
                "120 kcal",
                "Starter"
        ));

        menuItemList.add(new MenuItemAttributes(
                R.drawable.vegetable_soup,
                "Vegetable Soup",
                "A warm, hearty soup made with seasonal vegetables.",
                "150 kcal",
                "Starter"
        ));

        menuItemList.add(new MenuItemAttributes(
                R.drawable.angel_food_cake_with_oranges,
                "Angel Food Cake with Oranges",
                "Light and fluffy cake topped with zesty orange slices.",
                "280 kcal",
                "Dessert"
        ));

        menuItemList.add(new MenuItemAttributes(
                R.drawable.vegetable_pudding,
                "Vegetable Pudding",
                "A unique twist on pudding using sweet seasonal vegetables.",
                "300 kcal",
                "Dessert"
        ));

        menuItemList.add(new MenuItemAttributes(
                R.drawable.yogurt_dessert,
                "Yogurt Dessert",
                "Creamy yogurt layered with fruit and granola crunch.",
                "200 kcal",
                "Dessert"
        ));


        adapter = new RecyclerViewAdapter(this, menuItemList);
        recyclerView.setAdapter(adapter);

        Button buttonAll = findViewById(R.id.buttonAll);
        Button buttonStarters = findViewById(R.id.buttonStarters);
        Button buttonMains = findViewById(R.id.buttonMains);
        Button buttonDesserts = findViewById(R.id.buttonDesserts);

        View.OnClickListener filterListener = v -> {
            String filter = "";

            int id = v.getId();
            if (id == R.id.buttonStarters) {
                filter = "Starter";
            } else if (id == R.id.buttonMains) {
                filter = "Main";
            } else if (id == R.id.buttonDesserts) {
                filter = "Dessert";
            } else {
                filter = "All";
            }


            List<MenuItemAttributes> filteredList = new ArrayList<>();
            for (MenuItemAttributes item : menuItemList) {
                if (filter.equals("All") || item.getCategory().equalsIgnoreCase(filter)) {
                    filteredList.add(item);
                }
            }

            adapter.updateList(filteredList);
        };

        buttonAll.setOnClickListener(filterListener);
        buttonStarters.setOnClickListener(filterListener);
        buttonMains.setOnClickListener(filterListener);
        buttonDesserts.setOnClickListener(filterListener);

    }
}
