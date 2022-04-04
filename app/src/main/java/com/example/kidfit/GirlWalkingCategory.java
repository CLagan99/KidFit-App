package com.example.kidfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GirlWalkingCategory extends AppCompatActivity {

    Button startExercise, goBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girl_walking_category);

        startExercise = findViewById(R.id.btn_start_exercise);
        goBack = findViewById(R.id.btn_go_back);

        startExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GirlWalkingCategory.this, GirlWalkingActivity.class);
                startActivity(intent);
            }
        });

        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GirlWalkingCategory.this, ActivityGirlCategoryList.class);
                startActivity(intent);
            }
        });
    }
}