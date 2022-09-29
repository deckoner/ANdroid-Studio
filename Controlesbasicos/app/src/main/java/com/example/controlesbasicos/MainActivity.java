package com.example.controlesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private TextView lblPrueba;
    private TextView lblPrueba1;
    private ToggleButton tbOn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblPrueba = findViewById(R.id.lblPrueba);
        lblPrueba1 = findViewById(R.id.lblPrueba2);
        tbOn = findViewById(R.id.tbOn);

        tbOn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View vista) {
                if (tbOn.isChecked()) {
                    lblPrueba1.setText("¡ESTOY ON UwU!");
                } else {
                    lblPrueba1.setText("¡ESTOY OFF UwU!");
                }
            }
        });



    };

    public void pulsar(View vista) {
        lblPrueba.setText("¡ME PULSASTES UwU!");
    }
}