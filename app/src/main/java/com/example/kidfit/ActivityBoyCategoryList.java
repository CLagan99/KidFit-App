package com.example.kidfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivityBoyCategoryList extends AppCompatActivity {

    ListView boyCategory;
    Button btnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boy_category_list);

        boyCategory = findViewById(R.id.lv_boy_category);
        btnMenu = findViewById(R.id.btn_menu);

        ArrayList<Category> arrayList = new ArrayList<>();

        arrayList.add(new Category(R.drawable.football_icon, "Football", "Score to Victory"));
        arrayList.add(new Category(R.drawable.mario_icon, "Super Mario", "Leap to Success"));
        arrayList.add(new Category(R.drawable.hot_wheels_icon, "Hot Wheels", "Speed Your Way to Success"));
        arrayList.add(new Category(R.drawable.lego_icon, "LEGO", "Build Up to the Top"));
        arrayList.add(new Category(R.drawable.minecraft_icon, "Minecraft", "Mine Your Way to Diamonds"));
        arrayList.add(new Category(R.drawable.fortnite_icon, "Fortnite", "Fight for the Victory Royale"));
        arrayList.add(new Category(R.drawable.boy_walking_icon, "Just Keep Walking", "Every Step Counts"));

        CategoryAdapter categoryAdapter = new CategoryAdapter(this, R.layout.category_list_row, arrayList);

        boyCategory.setAdapter(categoryAdapter);

        boyCategory.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(view.getContext(), FootballCategory.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Intent intent = new Intent(view.getContext(), MarioCategory.class);
                    startActivity(intent);
                } else if (position == 2) {
                    Intent intent = new Intent(view.getContext(), HotWheelsCategory.class);
                    startActivity(intent);
                } else if (position == 3) {
                    Intent intent = new Intent(view.getContext(), LegoCategory.class);
                    startActivity(intent);
                } else if (position == 4) {
                    Intent intent = new Intent(view.getContext(), MinecraftCategory.class);
                    startActivity(intent);
                } else if (position == 5) {
                    Intent intent = new Intent(view.getContext(), FortniteCategory.class);
                    startActivity(intent);
                } else if (position == 6) {
                    Intent intent = new Intent(view.getContext(), BoyWalkingCategory.class);
                    startActivity(intent);
                }
            }
        });

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityBoyCategoryList.this, BoyHomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}