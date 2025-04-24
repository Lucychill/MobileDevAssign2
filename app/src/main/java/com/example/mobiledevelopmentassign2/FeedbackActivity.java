package com.example.mobiledevelopmentassign2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FeedbackActivity extends AppCompatActivity {

    // declare elements
    EditText nameField, emailField, feedbackField;
    Button submitFeedbackBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedback_main); // display the screen / activity

        // initialize UI elements by their ID
        nameField = findViewById(R.id.nameField);
        emailField = findViewById(R.id.emailField);
        feedbackField = findViewById(R.id.feedbackField);
        submitFeedbackBtn = findViewById(R.id.submitFeedbackBtn);

        // submit button function
        submitFeedbackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // message to thank the user
                Toast.makeText(FeedbackActivity.this, "Thank you for your feedback!", Toast.LENGTH_SHORT).show();

                // clear the input fields
                nameField.setText("");
                emailField.setText("");
                feedbackField.setText("");
            }
        });
    }
}
