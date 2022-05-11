package com.jico.mokkoji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class LoginActivity extends AppCompatActivity {

    Button btn;
    ImageButton kakaoLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        kakaoLogin = findViewById(R.id.kakaoLogin);
        btn = findViewById(R.id.loginBtn);

        Intent LoginIntent = new Intent(LoginActivity.this, MainActivity.class);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(LoginIntent);
            }
        });

        Intent kakaoLoginIntent = new Intent(LoginActivity.this, SettingsActivity.class);
        kakaoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(kakaoLoginIntent);
            }
        });
    }
}