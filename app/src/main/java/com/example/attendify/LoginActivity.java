package com.example.attendify;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findViewById(R.id.registerLink).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,com.example.myapp.RegisterActivity.class));
            }
        });

        findViewById(R.id.forgotPasswordLink).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add Forgot Password functionality here
            }
        });
    }
}
