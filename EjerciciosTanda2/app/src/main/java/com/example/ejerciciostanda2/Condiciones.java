package com.example.ejerciciostanda2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Condiciones extends AppCompatActivity {

    private Button btnVerificar, btnVolver2;
    private EditText etApellidos, etNombre;
    private TextView tvCondiciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condiciones);

        btnVerificar = findViewById(R.id.btnVerificar);
        btnVolver2 = findViewById(R.id.btnVolver2);
        etApellidos = findViewById(R.id.etApellidos);
        etNombre = findViewById(R.id.etNombre);
        tvCondiciones = findViewById(R.id.tvCondiciones);

        btnVerificar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Condiciones.this, CondicionesAceptar.class);
                startActivity(intent);
            }
        });

        btnVolver2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Condiciones.this, MainActivity.class);
                intent.putExtra("NOMBRE", etNombre.getText().toString());
                intent.putExtra("apellidos", etApellidos.getText().toString());
                startActivity(intent);
            }
        });
    }
}