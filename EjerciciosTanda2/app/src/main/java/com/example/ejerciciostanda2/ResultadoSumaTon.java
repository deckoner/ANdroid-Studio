package com.example.ejerciciostanda2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultadoSumaTon extends AppCompatActivity {

    private Button btnVolver;
    private TextView tvCorrecto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_suma_ton);

        btnVolver = findViewById(R.id.btnVolver);

        Bundle b = new Bundle();
        int n1 = b.getInt("numero1");
        int n2 = b.getInt("numero1");
        int resultado = b.getInt("numero1");

        boolean correcto = false;

        if ((n1 + n2) == resultado) {
            correcto = true;
        }

        if (correcto){
            tvCorrecto.setText(R.string.correcto);
        } else {
            tvCorrecto.setText(R.string.incorrecto);
        }

        boolean finalCorrecto = correcto;
        btnVolver.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ResultadoSumaTon.this, SumaTon.class);
                intent.putExtra("correcto", finalCorrecto);

                startActivity(intent);
            }
        });
    }
}