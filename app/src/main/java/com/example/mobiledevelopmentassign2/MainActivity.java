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
            R.drawable.chicken_salad,  // Replace with your image resources
            R.drawable.vegetable_soup,
            R.drawable.yogurt_dessert
    };
    private int currentImageIndex = 0;  // Index to track the current image

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

        // Set up the banner image view
        bannerImage = findViewById(R.id.imageView);  // Assuming you added ImageView with id bannerImage in your layout

        // Set the initial image
        bannerImage.setImageResource(imageView[currentImageIndex]);

        // Set up button listeners to change banner images and navigate to activities
        menuBtn.setOnClickListener(v -> navigateAndChangeImage(MenuActivity.class));
        feedbackBtn.setOnClickListener(v -> navigateAndChangeImage(FeedbackActivity.class));
        calculatorBtn.setOnClickListener(v -> navigateAndChangeImage(CalorieCalculatorActivity.class));
        policyBtn.setOnClickListener(v -> navigateAndChangeImage(CompanyPolicyActivity.class));
        homeBtn.setOnClickListener(v -> navigateAndChangeImage(HomeActivity.class));
        helpBtn.setOnClickListener(v -> navigateAndChangeImage(HelpActivity.class));
    }

    // A helper function to navigate to an activity and change the image
    private void navigateAndChangeImage(Class<?> activityClass) {
        // Change the image when the button is clicked
        currentImageIndex = (currentImageIndex + 1) % imageView.length;  // Move to next image, loop back if at end
        bannerImage.setImageResource(imageView[currentImageIndex]);

        // Create and start the intent to navigate to the selected activity
        Intent intent = new Intent(MainActivity.this, activityClass);
        startActivity(intent);
    }
}
