package com.example.ejerciciostanda2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnSumaton, btnCOndiciones, btnRoboDatos, btnLoMio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCOndiciones = findViewById(R.id.btnCOndiciones);
        btnSumaton = findViewById(R.id.btnSumaton);
        btnRoboDatos = findViewById(R.id.btnRoboDatos);
        btnLoMio = findViewById(R.id.btnLoMio);

        btnSumaton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SumaTon.class);
                startActivity(intent);
            }
        });

        btnRoboDatos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RobarDatos.class);
                startActivity(intent);
            }
        });
    }
}