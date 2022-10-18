package com.example.listayintenciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner sPaises;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sPaises = findViewById(R.id.sPaises);

        tvResultado = findViewById(R.id.tvResultado);


        tvResultado.setText();

        sPaises.getSelectedItem();
    }
}