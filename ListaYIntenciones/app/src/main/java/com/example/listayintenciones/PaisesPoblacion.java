package com.example.listayintenciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class PaisesPoblacion extends AppCompatActivity {

    private Spinner sPaises;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paises_poblacion);

        sPaises = findViewById(R.id.sPaises);

        tvResultado = findViewById(R.id.tvResultado);


        sPaises.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                switch(sPaises.getSelectedItem().toString()){

                    case("España"):
                        tvResultado.setText("Poblacion: 47,35 millones");
                        break;

                    case("Argentina"):
                        tvResultado.setText("Poblacion: 45,38 millones");
                        break;

                    case("Canada"):
                        tvResultado.setText("Poblacion: 38,01 millones");
                        break;

                    case("Filipinas"):
                        tvResultado.setText("Poblacion: 109,6 millones");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                tvResultado.setText("Elige un pais que te voy a decir cositas");
            }
        });
    }
}