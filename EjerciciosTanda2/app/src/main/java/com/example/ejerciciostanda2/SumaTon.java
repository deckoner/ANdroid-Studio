package com.example.ejerciciostanda2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SumaTon extends AppCompatActivity {

    private EditText etNumero1, etNumero2, etResultado;
    private Button btnComprobar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma_ton);

        etNumero1 = findViewById(R.id.etNumero1);
        etNumero2 = findViewById(R.id.etNumero2);
        etResultado = findViewById(R.id.etResultado);

        btnComprobar = findViewById(R.id.btnComprobar);

        //Desabilitamos la edicion y ponemos los numeros aleatorios
        int n1 = (int) (Math.random()*100+1);
        int n2 = (int) (Math.random()*100+1);
        etNumero1.setText(String.valueOf(n1));
        etNumero2.setText(String.valueOf(n2));
        etNumero1.setEnabled(false);
        etNumero2.setEnabled(false);
    }
}