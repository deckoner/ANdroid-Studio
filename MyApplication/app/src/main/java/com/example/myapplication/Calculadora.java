package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity implements View.OnClickListener {

    private Button btnSuma;
    private Button btnRestar;
    private Button btnMultiplicar;
    private Button btnDividir;
    private TextView tvResultado;
    private TextView editTextNumber1;
    private TextView editTextNumber2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        btnSuma = findViewById(R.id.btnSuma);
        btnRestar = findViewById(R.id.btnRestar);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);

        tvResultado = findViewById(R.id.tvResultado);
        editTextNumber1 = findViewById(R.id.editTextNumber1);
        editTextNumber2 = findViewById(R.id.editTextNumber2);

        btnSuma.setOnClickListener(this);
        btnRestar.setOnClickListener(this);
        btnMultiplicar.setOnClickListener(this);
        btnDividir.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        float resultado = 0;

        boolean dividirZero = false;

        int id = v.getId();
        int n1 = Integer.parseInt(editTextNumber1.getText().toString());
        int n2 = Integer.parseInt(editTextNumber2.getText().toString());

        switch (id) {
            case R.id.btnSuma:
                resultado = n1 + n2;
                break;

            case R.id.btnRestar:
                resultado = n1 - n2;
                break;

            case R.id.btnMultiplicar:
                resultado = n1*n2;
                break;

            case R.id.btnDividir:
                try {
                    resultado = n1 / n2;
                }
                catch (ArithmeticException e){
                    dividirZero = true;
                }
                break;

        }

        if (dividirZero) {
            tvResultado.setText("No se puede dividir por zero");

        } else {
            tvResultado.setText(String.valueOf(resultado));

        }
    }
}