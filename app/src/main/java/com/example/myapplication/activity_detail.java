package com.example.myapplication;

import android.os.Bundle;
import android.widget.RatingBar;

import androidx.appcompat.app.AppCompatActivity;

public class activity_detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        RatingBar ratingBar = findViewById(R.id.ratingStar);

    }
}