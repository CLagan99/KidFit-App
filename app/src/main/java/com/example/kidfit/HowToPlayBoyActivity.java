package com.example.kidfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class HowToPlayBoyActivity extends AppCompatActivity {

    Animation topAnim;
    TextView title, desc1, desc2, desc3, desc4;
    Button btnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boy_how_to_play);

        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_anim);
        title = findViewById(R.id.txt_how_to_title);
        desc1 = findViewById(R.id.txt_how_to_description);
        desc2 = findViewById(R.id.txt_how_to_description2);
        desc3 = findViewById(R.id.txt_how_to_description3);
        desc4 = findViewById(R.id.txt_how_to_description4);
        btnMenu = findViewById(R.id.btn_menu);

        title.setAnimation(topAnim);
        desc1.setAnimation(topAnim);
        desc2.setAnimation(topAnim);
        desc3.setAnimation(topAnim);
        desc4.setAnimation(topAnim);

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HowToPlayBoyActivity.this, BoyHomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}