package com.example.ejerciciostanda2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ResultadosRobarDatos extends AppCompatActivity {

    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados_robar_datos);

        tvResultado = findViewById(R.id.tvResultado);

        Bundle b = new Bundle();
        String nombre = b.getString("nombre");
        String apellido = b.getString("apellido");
        String genero = b.getString("genero");
        ArrayList<String> aficionesLista = (ArrayList<String>) getIntent().getStringArrayListExtra("aficiones");

        String resultado ="Nombre: " + nombre + "\nApellidos: " + apellido + "\nGenero: " + genero;

        tvResultado.setText(resultado);
    }
}