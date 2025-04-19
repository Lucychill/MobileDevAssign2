package com.example.mobiledevelopmentassign2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FeedbackActivity extends AppCompatActivity {

    EditText nameField, emailField, feedbackField;
    Button submitFeedbackBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedback_main);

        nameField = findViewById(R.id.nameField);
        emailField = findViewById(R.id.emailField);
        feedbackField = findViewById(R.id.feedbackField);
        submitFeedbackBtn = findViewById(R.id.submitFeedbackBtn);

        submitFeedbackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FeedbackActivity.this, "Thank you for your feedback!", Toast.LENGTH_SHORT).show();

                // clearing the fields
                nameField.setText("");
                emailField.setText("");
                feedbackField.setText("");
            }
        });
    }
}
