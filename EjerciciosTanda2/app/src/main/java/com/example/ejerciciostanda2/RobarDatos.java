package com.example.ejerciciostanda2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class RobarDatos extends AppCompatActivity {

    private RadioGroup rbGeneroEleccion;
    private CheckBox cbLibros, cbVideojuegos, cbHedonismo, cbFicha, cbJugger;
    private EditText etNombre, etApellidos;
    private Button btEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robar_datos);

        btEnviar = findViewById(R.id.btEnviar);

        rbGeneroEleccion = findViewById(R.id.rbGeneroEleccion);

        etNombre = findViewById(R.id.etNombre);
        etApellidos = findViewById(R.id.etApellidos);

        cbLibros = findViewById(R.id.cbLibros);
        cbVideojuegos = findViewById(R.id.cbVideojuegos);
        cbHedonismo = findViewById(R.id.cbHedonismo);
        cbFicha = findViewById(R.id.cbFicha);
        cbJugger = findViewById(R.id.cbJugger);

        btEnviar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(RobarDatos.this, ResultadosRobarDatos.class);
                intent.putExtra("nombre", etNombre.getText());
                intent.putExtra("apellido", etApellidos.getText());

                //Creamos el radiobuton en base a la seleccion del grupo y pasamos su valor a un putextra
                RadioButton rb = (RadioButton) findViewById(rbGeneroEleccion.getCheckedRadioButtonId());
                intent.putExtra("genero", rb.getText().toString());

                //Creamos una lista para las aficiones y lo pasamos al putextra
                ArrayList<String> aficionesListas = new ArrayList<String>();
                if (cbLibros.isChecked()) {
                    aficionesListas.add("Lectura");
                }
                if (cbVideojuegos.isChecked()) {
                    aficionesListas.add("Videojuegos");
                }
                if (cbHedonismo.isChecked()) {
                    aficionesListas.add("Hedonismo");
                }
                if (cbFicha.isChecked()) {
                    aficionesListas.add("Tirar fichas");
                }
                if (cbJugger.isChecked()) {
                    aficionesListas.add("Jugger");
                }
                intent.putExtra("aficiones", aficionesListas);

                startActivityForResult(intent, 1);
            }
        });
    }
}