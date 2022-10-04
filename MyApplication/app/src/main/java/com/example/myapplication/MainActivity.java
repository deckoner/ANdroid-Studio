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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalculadora = findViewById(R.id.btnCalculadora);
        btnComprobarDNI = findViewById(R.id.btnComprobarDNI);
        btnFPantalla = findViewById(R.id.btnFPantalla);
        btnDomotica = findViewById(R.id.btnDomotica);

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
    }
}