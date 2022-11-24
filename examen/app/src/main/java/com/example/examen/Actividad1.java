package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class Actividad1 extends AppCompatActivity {

    Button btnAceptarActividad1, btnCancelarActividad1;

    EditText etdFecha, edtNombre, edtApellidos;

    Spinner spinnerOrigen, spinnerDestino;

    RadioGroup rgHoraSalida;

    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);

        //Asociamos los diferentes elementos de la aplicacion
        btnAceptarActividad1 = findViewById(R.id.btnAceptarActividad1);
        btnCancelarActividad1 = findViewById(R.id.btnCancelarActividad1);
        etdFecha = findViewById(R.id.etdFecha);
        edtNombre = findViewById(R.id.edtNombre);
        edtApellidos = findViewById(R.id.edtApellidos);
        spinnerOrigen = findViewById(R.id.spinnerOrigen);
        spinnerDestino = findViewById(R.id.spinnerDestino);
        rgHoraSalida = findViewById(R.id.rgHoraSalida);

        btnAceptarActividad1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Actividad1.this, Actividad1Parte2.class);
                Bundle bundle = new Bundle();

                bundle.putString("nombre",edtNombre.getText().toString());
                bundle.putString("fecha",etdFecha.getText().toString());
                bundle.putString("apellidos",edtApellidos.getText().toString());
                bundle.putString("origen",spinnerOrigen.getSelectedItem().toString());
                bundle.putString("destino",spinnerDestino.getSelectedItem().toString());

                // Conseguimos el ID del RadioButton selecionado
                int selectedId = rgHoraSalida.getCheckedRadioButtonId();
                // Creamos una asociacion a un RadioButton con esa id
                radioButton = (RadioButton) findViewById(selectedId);
                // Y por ultimo conseguimos su valor para pasorlo
                bundle.putString("hora",radioButton.getText().toString());

                intent.putExtras(bundle);

                startActivity(intent);
            }
        });

        btnCancelarActividad1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Actividad1.this, MainActivity.class);
                startActivity(intent);            }
        });
    }
}