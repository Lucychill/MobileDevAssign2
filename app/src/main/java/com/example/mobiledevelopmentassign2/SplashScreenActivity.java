package com.example.mobiledevelopmentassign2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash); // Your splash screen layout

        // Add a delay (2 seconds) and then open the Main Activity
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);  // Or your main activity
            startActivity(intent);
            finish();  // close splash activity
        }, 5000); // set time
    }
}
