package com.example.mobiledevelopmentassign2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // declaring buttons for navigation
    Button menuBtn, feedbackBtn, calculatorBtn, policyBtn, homeBtn, helpBtn;
    ImageView bannerImage; // ImageView for banner

    // Array of image resource IDs for the banner
    private final int[] imageView = {
            R.drawable.chicken_salad,
            R.drawable.vegetable_soup,
            R.drawable.yogurt_dessert
    };
    private int currentImageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        // set the layout to the home screen
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // link each button with their ID
        menuBtn = findViewById(R.id.menuBtn);
        feedbackBtn = findViewById(R.id.feedbackBtn);
        calculatorBtn = findViewById(R.id.calculatorBtn);
        policyBtn = findViewById(R.id.policyBtn);
        homeBtn = findViewById(R.id.homeBtn);
        helpBtn = findViewById(R.id.helpBtn);

        // set up the banner
        bannerImage = findViewById(R.id.imageView);
        bannerImage.setImageResource(imageView[currentImageIndex]);

        // buttons navigate to different activities
        menuBtn.setOnClickListener(v -> navigateAndChangeImage(MenuActivity.class));
        feedbackBtn.setOnClickListener(v -> navigateAndChangeImage(FeedbackActivity.class));
        calculatorBtn.setOnClickListener(v -> navigateAndChangeImage(CalorieCalculatorActivity.class));
        policyBtn.setOnClickListener(v -> navigateAndChangeImage(CompanyPolicyActivity.class));
        homeBtn.setOnClickListener(v -> navigateAndChangeImage(MainActivity.class));
        helpBtn.setOnClickListener(v -> navigateAndChangeImage(HelpActivity.class));
    }

    private void navigateAndChangeImage(Class<?> activityClass) {
        currentImageIndex = (currentImageIndex + 1) % imageView.length;
        bannerImage.setImageResource(imageView[currentImageIndex]);
        Intent intent = new Intent(MainActivity.this, activityClass);
        startActivity(intent);
    }
}
