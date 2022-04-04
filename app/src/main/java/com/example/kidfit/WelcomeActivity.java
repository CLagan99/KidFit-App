package com.example.kidfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    Animation topAnim;
    TextView txtWelcome;
    Button btnWelcomeStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_anim);

        txtWelcome = findViewById(R.id.txt_welcome);
        btnWelcomeStart = findViewById(R.id.btn_welcome_start);

        txtWelcome.setAnimation(topAnim);

        btnWelcomeStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}