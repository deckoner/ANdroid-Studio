package com.example.ejerciciostanda2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SumaTon extends AppCompatActivity {

    private EditText etNumero1, etNumero2, etResultado;
    private Button btnComprobar;
    private TextView tvContadores;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma_ton);

        etNumero1 = findViewById(R.id.etNumero1);
        etNumero2 = findViewById(R.id.etNumero2);
        etResultado = findViewById(R.id.etResultado);

        btnComprobar = findViewById(R.id.btnComprobar);

        tvContadores = findViewById(R.id.tvContadores);

        //Desabilitamos la edicion y ponemos los numeros aleatorios
        int n1 = (int) (Math.random()*100+1);
        int n2 = (int) (Math.random()*100+1);
        int contadoCorrecto = 0;
        int contadorIncorrecto = 0;


//        //Añadimos a la puntuacion dependiendo si ha acertado o no
//        if (correcto == 1){
//            contadoCorrecto++;
//        } else {
//            contadorIncorrecto++;
//        }
//
//        tvContadores.setText(R.string.textoCorrecto + contadoCorrecto + R.string.incorrectas + contadorIncorrecto);

        //Desabilitamos la edicion y ponemos los numeros aleatorios
        etNumero1.setText(String.valueOf(n1));
        etNumero2.setText(String.valueOf(n2));
        etNumero1.setEnabled(false);
        etNumero2.setEnabled(false);

        btnComprobar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(SumaTon.this, ResultadoSumaTon.class);
                intent.putExtra("numero1", n1);
                intent.putExtra("numero2", n2);
                intent.putExtra("resultado", Integer.parseInt(String.valueOf(etResultado.getText())));

                startActivityForResult(intent, 1);
            }
        });
    }
}