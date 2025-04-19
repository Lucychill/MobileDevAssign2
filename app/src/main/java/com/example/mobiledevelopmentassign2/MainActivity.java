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

    // Initialisation of the buttons on the home menu
    Button menuBtn, feedbackBtn, calculatorBtn, policyBtn, homeBtn, helpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Link buttons to their XML files so navigation works
        menuBtn = findViewById(R.id.menuBtn);
        feedbackBtn = findViewById(R.id.feedbackBtn);
        calculatorBtn = findViewById(R.id.calculatorBtn);
        policyBtn = findViewById(R.id.policyBtn);
        homeBtn = findViewById(R.id.homeBtn);
        helpBtn = findViewById(R.id.helpBtn);

        // Each button has an intent to take them to a menu
        homeBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(intent);
        });

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

        helpBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, HelpActivity.class);
            startActivity(intent);
        });
    }
}

