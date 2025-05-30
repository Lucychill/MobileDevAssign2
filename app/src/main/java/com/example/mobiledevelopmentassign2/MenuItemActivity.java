package com.example.mobiledevelopmentassign2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MenuItemActivity extends AppCompatActivity {

    ImageView itemImage;
    TextView itemTitle, itemDescription, itemCaloriesText;
    Button addToCalculatorBtn, backBtn;

    String name;
    int itemCalories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_item);

        // menu item details
        itemImage = findViewById(R.id.menuItemImage);
        itemTitle = findViewById(R.id.menuItemTitle);
        itemDescription = findViewById(R.id.menuItemDescription);
        itemCaloriesText = findViewById(R.id.menuItemCalories);
        addToCalculatorBtn = findViewById(R.id.addToCalculatorBtn);
        backBtn = findViewById(R.id.backToMenuBtn);

        Intent intent = getIntent();
        int imageRes = intent.getIntExtra("IMAGE_RESOURCE", R.drawable.chicken_fried_rice);
        name = intent.getStringExtra("NAME");
        String description = intent.getStringExtra("DESCRIPTION");
        String caloriesStr = intent.getStringExtra("CALORIES");

        // get the calories
        try {
            itemCalories = Integer.parseInt(caloriesStr.split(" ")[0]);
        } catch (Exception e) {
            itemCalories = 0;
            e.printStackTrace();
        }

        itemImage.setImageResource(imageRes);
        itemTitle.setText(name);
        itemDescription.setText(description);
        itemCaloriesText.setText("Calories: " + itemCalories);

        // back button functional
        backBtn.setOnClickListener(v -> finish());

        // navigate to calorie calculator and add selected item at the same time
        addToCalculatorBtn.setOnClickListener(v -> {
            CalorieTracker.addItem(new CalorieItem(name, itemCalories));
            Intent calorieIntent = new Intent(MenuItemActivity.this, CalorieCalculatorActivity.class);
            startActivity(calorieIntent);
        });
    }
}
