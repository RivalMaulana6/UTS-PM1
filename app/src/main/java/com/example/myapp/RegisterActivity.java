package com.example.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RegisterActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button registerBtn = findViewById(R.id.registerBtn);
        registerBtn.setOnClickListener(v -> {
            Log.d("RegisterActivity", "Register button clicked");
            Toast.makeText(RegisterActivity.this, "Register clicked", Toast.LENGTH_SHORT).show();
        });
    }
}