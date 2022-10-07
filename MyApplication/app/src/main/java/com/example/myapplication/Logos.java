package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Logos extends AppCompatActivity {

    private Button btnYahoo, btnBing, btnGoogle;
    private ImageView ivLogos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logos);

        btnYahoo = findViewById(R.id.btnYahoo);
        btnBing = findViewById(R.id.btnBing);
        btnGoogle = findViewById(R.id.btnGoogle);

        ivLogos = findViewById(R.id.ivLogos);


        btnGoogle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                ivLogos.setImageDrawable(@drawable/google.png);
            }
        });


    }
}