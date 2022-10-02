package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Calculadora extends AppCompatActivity {

    private Button btnSuma;
    private Button btnRestar;
    private Button btnMultiplicar;
    private Button btnDividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        btnSuma = findViewById(R.id.btnSuma);
        btnRestar = findViewById(R.id.btnRestar);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);

        btnSuma.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}