package com.example.kidfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class GirlExerciseTutorialsActivity extends AppCompatActivity {

    ListView girlTutorials;
    Button btnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girl_exercise_tutorials);

        girlTutorials = findViewById(R.id.lv_girl_tutorials);
        btnMenu = findViewById(R.id.btn_menu);

        ArrayList<Category> arrayList = new ArrayList<>();

        arrayList.add(new Category(R.drawable.jumping_jacks, "Jumping Jacks", "Learn how to do jumping jacks"));
        arrayList.add(new Category(R.drawable.sit_ups, "Sit-Ups", "Learn how to do sit-ups"));
        arrayList.add(new Category(R.drawable.press_ups, "Press Ups", "Learn how to do press ups"));
        arrayList.add(new Category(R.drawable.skipping, "Skipping", "Learn how to do skip"));
        arrayList.add(new Category(R.drawable.arms_over_head, "Arms Over Head", "Learn how to do arms over head"));
        arrayList.add(new Category(R.drawable.lunge, "Lunges", "Learn how to do lunges"));
        arrayList.add(new Category(R.drawable.squat, "Squats", "Learn how to do squats"));

        CategoryAdapter categoryAdapter = new CategoryAdapter(this, R.layout.category_list_row, arrayList);

        girlTutorials.setAdapter(categoryAdapter);

        girlTutorials.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(view.getContext(), GirlJumpingJacks.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Intent intent = new Intent(view.getContext(), GirlSitUps.class);
                    startActivity(intent);
                } else if (position == 2) {
                    Intent intent = new Intent(view.getContext(), GirlPressUps.class);
                    startActivity(intent);
                } else if (position == 3) {
                    Intent intent = new Intent(view.getContext(), GirlSkipping.class);
                    startActivity(intent);
                } else if (position == 4) {
                    Intent intent = new Intent(view.getContext(), GirlArmsOverHead.class);
                    startActivity(intent);
                } else if (position == 5) {
                    Intent intent = new Intent(view.getContext(), GirlLunges.class);
                    startActivity(intent);
                } else if (position == 6) {
                    Intent intent = new Intent(view.getContext(), GirlSquats.class);
                    startActivity(intent);
                }
            }
        });

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GirlExerciseTutorialsActivity.this, GirlHomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}