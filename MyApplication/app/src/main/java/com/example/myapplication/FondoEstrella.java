package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FondoEstrella extends AppCompatActivity {

    private Button btnEstrella, btnEstrella2;
    private ConstraintLayout constraintL;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fondo_estrella);

        btnEstrella = findViewById(R.id.buttonStrellita);
        btnEstrella2 = findViewById(R.id.buttonStrellita2);


        constraintL = findViewById(R.id.constraintL);

        btnEstrella.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            public void onClick(View v) {

                constraintL.setBackgroundColor(R.color.black);
            }
        });

        btnEstrella2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            public void onClick(View v) {

                constraintL.setBackgroundColor(R.color.white);
            }
        });

    }
}