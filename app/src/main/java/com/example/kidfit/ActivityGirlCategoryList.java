package com.example.kidfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivityGirlCategoryList extends AppCompatActivity {

    ListView girlCategory;
    Button btnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girl_category_list);

        girlCategory = findViewById(R.id.lv_girl_category);
        btnMenu = findViewById(R.id.btn_menu);

        ArrayList<Category> arrayList = new ArrayList<>();

        arrayList.add(new Category(R.drawable.barbie_icon, "Barbie", "Pursue your Beauty"));
        arrayList.add(new Category(R.drawable.pink_teddy_bear_icon, "Teddy Bear", "Cuddle for Success"));
        arrayList.add(new Category(R.drawable.frozen_elsa_png, "Frozen", "Let it Go"));
        arrayList.add(new Category(R.drawable.lol_dolls_icon, "LOL Dolls", "Show off your looks"));
        arrayList.add(new Category(R.drawable.doll_house_icon, "Doll House", "Build it your way"));
        arrayList.add(new Category(R.drawable.girl_walking_icon, "Just Keep Walking", "Every Step Counts"));


        CategoryAdapter categoryAdapter = new CategoryAdapter(this, R.layout.category_list_row, arrayList);

        girlCategory.setAdapter(categoryAdapter);

        girlCategory.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(view.getContext(), BarbieCategory.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Intent intent = new Intent(view.getContext(), TeddyBearCategory.class);
                    startActivity(intent);
                } else if (position == 2) {
                    Intent intent = new Intent(view.getContext(), FrozenCategory.class);
                    startActivity(intent);
                } else if (position == 3) {
                    Intent intent = new Intent(view.getContext(), LolCategory.class);
                    startActivity(intent);
                } else if (position == 4) {
                    Intent intent = new Intent(view.getContext(), DollHouseCategory.class);
                    startActivity(intent);
                } else if (position == 5) {
                    Intent intent = new Intent(view.getContext(), GirlWalkingCategory.class);
                    startActivity(intent);
                }
            }
        });

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityGirlCategoryList.this, GirlHomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}