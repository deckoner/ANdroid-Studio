package com.example.ejerciciostanda2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CondicionesAceptar extends AppCompatActivity {

    private TextView tvCondicion;
    private Button btnAceptar, btnRechazar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condiciones_aceptar);

        tvCondicion = findViewById(R.id.tvCondicion);
        btnAceptar = findViewById(R.id.btnAceptar);
        btnRechazar = findViewById(R.id.btnRechazar);

        Bundle b = new Bundle();
        String nombre = b.getString("nombre");
        String apellidos = b.getString("apellidos");

        String txt = "Hola " + nombre + " " + apellidos + " ¿Aceptas las condiciones?";

        tvCondicion.setText(txt);

        btnAceptar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(CondicionesAceptar.this, Condiciones.class);
                startActivityForResult(intent, 1);
            }
        });

        btnRechazar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(CondicionesAceptar.this, Condiciones.class);
                startActivityForResult(intent, 0);
            }
        });
    }
}