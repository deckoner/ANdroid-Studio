package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnSalirLogin, btnActividad2, btnActividad1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Asociamos los diferentes elementos de la aplicacion
        btnSalirLogin = findViewById(R.id.btnSalirLogin);
        btnActividad2 = findViewById(R.id.btnActividad2);
        btnActividad1 = findViewById(R.id.btnActividad1);


        btnSalirLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        btnActividad1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Actividad1.class);
                startActivity(intent);            }
        });

        btnActividad2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Actividad2.class);
                startActivity(intent);            }
        });
    }
}