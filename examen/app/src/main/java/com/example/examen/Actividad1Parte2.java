package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Actividad1Parte2 extends AppCompatActivity {

    TextView tvFecha, tvNombre, tvApellidos, tvOrigen, tvDestino, tvHoraSalida;

    Button btnSi, btnNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1_parte2);

        tvFecha = findViewById(R.id.tvFecha);
        tvNombre = findViewById(R.id.tvNombre);
        tvApellidos = findViewById(R.id.tvApellidos);
        tvOrigen = findViewById(R.id.tvOrigen);
        tvDestino = findViewById(R.id.tvHoraSalida);
        tvHoraSalida = findViewById(R.id.tvHoraSalida);
        btnSi = findViewById(R.id.btnSi);
        btnNo = findViewById(R.id.btnNo);


        //Obteniendo la instancia del Intent
        Intent intent = getIntent();

        Bundle bundle = getIntent().getExtras();

        //Extrayendo el extra de tipo cadena
        String name = bundle.getString("nombre");
        String apellidos = bundle.getString("apellidos");
        String fecha = bundle.getString("fecha");
        String origen = bundle.getString("origen");
        String destino = bundle.getString("destino");
        String horaSalida = bundle.getString("hora");

        //Seteando el valor del extra en el TextView
        tvNombre.setText(name);
        tvApellidos.setText(apellidos);
        tvFecha.setText(fecha);
        tvOrigen.setText(origen);
        tvDestino.setText(destino);
        tvHoraSalida.setText(horaSalida);


        btnSi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Actividad1Parte2.this, Actividad1.class);
                startActivity(intent);            }
        });

        btnNo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Actividad1Parte2.this, Actividad1.class);
                startActivity(intent);            }
        });
    }
}