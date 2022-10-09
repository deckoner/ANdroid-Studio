package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnCalculadora;
    private Button btnComprobarDNI;
    private Button btnFPantalla;
    private Button btnDomotica;
    private Button btnLogos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalculadora = findViewById(R.id.btnCalculadora);
        btnComprobarDNI = findViewById(R.id.btnComprobarDNI);
        btnFPantalla = findViewById(R.id.btnFPantalla);
        btnDomotica = findViewById(R.id.btnDomotica);
        btnLogos = findViewById(R.id.btnLogos);

        btnCalculadora.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Calculadora.class);
                startActivity(intent);
            }
        });

        btnFPantalla.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FondoEstrella.class);
                startActivity(intent);
            }
        });

        btnComprobarDNI.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ComprobarDNI.class);
                startActivity(intent);
            }
        });

        btnLogos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Logos.class);
                startActivity(intent);
            }
        });

        btnDomotica.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Domotica.class);
                startActivity(intent);
            }
        });
    }
}