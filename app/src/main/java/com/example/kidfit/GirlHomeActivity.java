package com.example.kidfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GirlHomeActivity extends AppCompatActivity {

    Button btnStart, btnHowToPlay, btnTutorials, btnAboutUs, btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girl_home);

        btnStart = findViewById(R.id.btn_start);
        btnHowToPlay = findViewById(R.id.btn_how_to_play);
        btnTutorials = findViewById(R.id.btn_tutorials);
        btnAboutUs = findViewById(R.id.btn_about_us);
        btnExit = findViewById(R.id.btn_exit);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GirlHomeActivity.this, ActivityGirlCategoryList.class);
                startActivity(intent);
                finish();
            }
        });

        btnHowToPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GirlHomeActivity.this, HowToPlayGirlActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnTutorials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GirlHomeActivity.this, GirlExerciseTutorialsActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GirlHomeActivity.this, AboutUsGirlActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GirlHomeActivity.this, ProfileActivity.class);
                Toast.makeText(GirlHomeActivity.this, "Successfully Exited the Girl's Zone", Toast.LENGTH_LONG).show();
                startActivity(intent);
                finish();
            }
        });
    }
}