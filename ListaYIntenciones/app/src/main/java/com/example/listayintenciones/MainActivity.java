package com.example.listayintenciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnPaises, btnPaginas, btnEjercicioL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPaises = findViewById(R.id.btnPaises);
        btnPaginas = findViewById(R.id.btnPaginas);
        btnEjercicioL = findViewById(R.id.btnEjercicioL);


        btnPaises.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PaisesPoblacion.class);
                startActivity(intent);
            }
        });

        btnPaginas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MisWebs.class);
                startActivity(intent);
            }
        });

        btnEjercicioL.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Ejerciciomio.class);
                startActivity(intent);
            }
        });
    }
}