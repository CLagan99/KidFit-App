package com.example.kidfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    EditText etName;
    Spinner spAgeGroup;
    RadioGroup radioGroup;
    RadioButton rbMale, rbFemale;
    Button btnBegin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        etName = findViewById(R.id.et_name);

        btnBegin = findViewById(R.id.btn_begin);

        rbMale = (RadioButton) findViewById(R.id.rb_male);
        rbFemale = (RadioButton) findViewById(R.id.rb_female);

        radioGroup = (RadioGroup) findViewById(R.id.gender_group);
        radioGroup.setOnCheckedChangeListener(this);

        Spinner spAgeGroup = findViewById(R.id.sp_age_group);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.age_group, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spAgeGroup.setAdapter(adapter);

        spAgeGroup.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position).equals("Choose an Age Group")) {
                    // Do Nothing

                } else {
                    // On Selecting Spinner Item
                    String item = parent.getItemAtPosition(position).toString();

                    // Show Selected Spinner Item
                    Toast.makeText(parent.getContext(), "You have Selected " + item, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        btnBegin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Begin();
            }
        });
    }

    private void Begin() {
        String name = etName.getText().toString();
        if(TextUtils.isEmpty(name)) {
            etName.setError("Please Enter Your Name");
            return;
        }

        if (rbMale.isChecked()) {
            Intent intent = new Intent(ProfileActivity.this, BoyHomeActivity.class);
            Toast.makeText(ProfileActivity.this, "Welcome to the Boy's Zone", Toast.LENGTH_LONG).show();
            startActivity(intent);
            finish();
        } else if (rbFemale.isChecked()) {
            Intent intent = new Intent(ProfileActivity.this, GirlHomeActivity.class);
            Toast.makeText(ProfileActivity.this, "Welcome to the Girl's Zone", Toast.LENGTH_LONG).show();
            startActivity(intent);
            finish();
        }
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        switch (i) {
            case R.id.rb_female:
                break;

            case R.id.rb_male:
                break;
        }
    }
}
