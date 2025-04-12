package com.example.mobiledevelopmentassign2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MenuItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_item_layout);

        ImageView itemImage = findViewById(R.id.detailImage);

        Intent intent = getIntent();
        int imageRes = intent.getIntExtra("IMAGE_RESOURCE", 0);

        itemImage.setImageResource(imageRes);
    }
}

