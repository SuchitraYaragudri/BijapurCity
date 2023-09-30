package com.example.bijapur;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CategoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        Button buttonBuses = findViewById(R.id.button1);
        Button buttonInstitute = findViewById(R.id.button2);
        Button buttonTourist = findViewById(R.id.button3);
        Button buttonTheater = findViewById(R.id.button4);
        Button buttonHospitals = findViewById(R.id.button5);
        Button buttonCelebrationHalls = findViewById(R.id.button6);

        buttonBuses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform action when Buses button is clicked
                Intent intent = new Intent(CategoriesActivity.this, BusActivity.class);
                startActivity(intent);
            }
        });

        buttonInstitute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform action when Institute button is clicked
                Intent intent = new Intent(CategoriesActivity.this, InstituteActivity.class);
                startActivity(intent);
            }
        });

        buttonTourist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform action when Tourist_Places button is clicked
                Intent intent = new Intent(CategoriesActivity.this, TouristActivity.class);
                startActivity(intent);
            }
        });

        buttonTheater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform action when Theaters button is clicked
                Intent intent = new Intent(CategoriesActivity.this, TheaterActivity.class);
                startActivity(intent);
            }
        });

        buttonHospitals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform action when Hospitals button is clicked
                Intent intent = new Intent(CategoriesActivity.this, HospitalActivity.class);
                startActivity(intent);
            }
        });

        buttonCelebrationHalls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform action when Celebration Halls button is clicked
                Intent intent = new Intent(CategoriesActivity.this, HallsActivity.class);
                startActivity(intent);
            }
        });
    }
}
