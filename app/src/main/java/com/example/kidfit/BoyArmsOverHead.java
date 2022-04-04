package com.example.kidfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BoyArmsOverHead extends AppCompatActivity {

    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boy_arms_over_head);

        btnBack = findViewById(R.id.btn_go_back);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BoyArmsOverHead.this, BoyExerciseTutorialsActivity.class);
                startActivity(intent);
            }
        });
    }
}