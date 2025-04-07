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

    // Declare the buttons
    Button menuBtn, feedbackBtn, calculatorBtn, policyBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Set system window insets if you're using edge-to-edge
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Link buttons to their XML IDs
        menuBtn = findViewById(R.id.menuBtn);
        feedbackBtn = findViewById(R.id.feedbackBtn);
        calculatorBtn = findViewById(R.id.calculatorBtn);
        policyBtn = findViewById(R.id.policyBtn);

        // Set up navigation for each button
        menuBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MenuActivity.class);
            startActivity(intent);
        });

        feedbackBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FeedbackActivity.class);
            startActivity(intent);
        });

        calculatorBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CalorieCalculatorActivity.class);
            startActivity(intent);
        });

        policyBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CompanyPolicyActivity.class);
            startActivity(intent);
        });
    }
}

