package com.example.kidfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AboutUsGirlActivity extends AppCompatActivity {

    Animation topAnim;
    ImageView imageView;
    TextView title, description;
    Button btnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us_girl);

        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_anim);
        imageView = findViewById(R.id.iv_kidfit);
        title = findViewById(R.id.txt_about_us);
        description = findViewById(R.id.txt_description);
        btnMenu = findViewById(R.id.btn_menu);

        imageView.setAnimation(topAnim);
        title.setAnimation(topAnim);
        description.setAnimation(topAnim);

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutUsGirlActivity.this, GirlHomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}