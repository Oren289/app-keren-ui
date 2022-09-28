package com.example.appkeren;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    private ImageButton backButton;
    private Button loginButton;
    private TextView forgotPassButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        backButton = findViewById(R.id.back_button);
        forgotPassButton = findViewById(R.id.login_forgot_password);
        loginButton = findViewById(R.id.login_login_button);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        forgotPassButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(Login.this, ForgotPassword.class);
                startActivity(pindah);
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(Login.this, SuccessLogin.class);
                startActivity(pindah);
            }
        });
    }
}