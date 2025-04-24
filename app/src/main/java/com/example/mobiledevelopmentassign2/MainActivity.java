package com.example.mobiledevelopmentassign2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // declaring buttons for navigation
    Button menuBtn, feedbackBtn, calculatorBtn, policyBtn, homeBtn, helpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        // set the layout to the home screen
        setContentView(R.layout.activity_main);

        // adjusting padding
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // link each button with the ID
        menuBtn = findViewById(R.id.menuBtn);
        feedbackBtn = findViewById(R.id.feedbackBtn);
        calculatorBtn = findViewById(R.id.calculatorBtn);
        policyBtn = findViewById(R.id.policyBtn);
        homeBtn = findViewById(R.id.homeBtn);
        helpBtn = findViewById(R.id.helpBtn);

        // setting up navigation for each button

        // navigation to home
        homeBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(intent);
        });

        // navigation to menu
        menuBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MenuActivity.class);
            startActivity(intent);
        });

        // navigation to feedback
        feedbackBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FeedbackActivity.class);
            startActivity(intent);
        });

        // navigation to calorie calculator
        calculatorBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CalorieCalculatorActivity.class);
            startActivity(intent);
        });

        // navigation to company policy
        policyBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CompanyPolicyActivity.class);
            startActivity(intent);
        });

        // navigation to help
        helpBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, HelpActivity.class);
            startActivity(intent);
        });
    }
}
