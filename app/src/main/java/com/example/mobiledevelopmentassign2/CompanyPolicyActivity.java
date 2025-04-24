package com.example.mobiledevelopmentassign2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class CompanyPolicyActivity extends AppCompatActivity {

    Button backToHomeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.company_policy_main);

        backToHomeBtn = findViewById(R.id.backToHomeBtn);

        backToHomeBtn.setOnClickListener(v -> {
            Intent intent = new Intent(CompanyPolicyActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}

