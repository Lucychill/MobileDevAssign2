package com.example.mobiledevelopmentassign2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MenuItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_item); // ✅ Use correct layout

        ImageView itemImage = findViewById(R.id.detailImage); // ✅ Will now be found

        int imageResId = getIntent().getIntExtra("IMAGE_RESOURCE", 0);
        itemImage.setImageResource(imageResId);

    }
}
