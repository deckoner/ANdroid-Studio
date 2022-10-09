package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;

public class Domotica extends AppCompatActivity {

    private Switch sEncenderAoagar;
    private ImageView ivLuzOffOn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_domotica);

        sEncenderAoagar = findViewById(R.id.sEncenderAoagar);
        ivLuzOffOn = findViewById(R.id.ivLuzOffOn);


        sEncenderAoagar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (sEncenderAoagar.isChecked()) {
                    ivLuzOffOn.setImageResource(R.drawable.ic_bombillaamarilla);
                } else {
                    ivLuzOffOn.setImageResource(R.drawable.ic_bombillaoff);
                }
            }
        });
    }
}