package com.example.mobiledevelopmentassign2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CalorieCalculatorActivity extends AppCompatActivity {

    private TextView selectedItemsText, totalCaloriesText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calorie_calculator_main);
        selectedItemsText = findViewById(R.id.selectedItemsText);
        totalCaloriesText = findViewById(R.id.totalCaloriesText);

        Button backToHomeBtn = findViewById(R.id.backToHomeBtn);
        Button returnToMenuBtn = findViewById(R.id.backToMenuButton);
        Button clearBtn = findViewById(R.id.clearBtn);

        // add to calorietracker
        Intent incomingIntent = getIntent();
        String receivedItemName = incomingIntent.getStringExtra("ITEM_NAME");
        int receivedItemCalories = incomingIntent.getIntExtra("ITEM_CALORIES", 0);

        if (receivedItemName != null) {
            CalorieTracker.addItem(new CalorieItem(receivedItemName, receivedItemCalories));
        }

        // Back to menu
        returnToMenuBtn.setOnClickListener(v -> {
            Intent menuIntent = new Intent(CalorieCalculatorActivity.this, MenuActivity.class);
            startActivity(menuIntent);
        });

        // Back to home
        backToHomeBtn.setOnClickListener(v -> {
            Intent homeIntent = new Intent(this, MainActivity.class);
            startActivity(homeIntent);
        });

        // Clear list and refresh
        clearBtn.setOnClickListener(v -> {
            CalorieTracker.clearItems();
            recreate();
        });
        updateUI();
    }

    private void updateUI() {
        StringBuilder itemsBuilder = new StringBuilder();
        for (CalorieItem item : CalorieTracker.getItems()) {
            itemsBuilder.append("- ")
                    .append(item.getName())
                    .append(": ")
                    .append(item.getCalories())
                    .append(" kcal\n");
        }

        selectedItemsText.setText("Selected Items:\n" + itemsBuilder.toString());
        totalCaloriesText.setText("Total Calories: " + CalorieTracker.getTotalCalories() + " kcal");
    }
}
