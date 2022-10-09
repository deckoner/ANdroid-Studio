package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ComprobarDNI extends AppCompatActivity {

    private Button btnValidarDNI;
    private EditText editTextDNI, editTextLetra;
    private TextView tvValidar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comprobar_dni);

        btnValidarDNI = findViewById(R.id.btnValidarDNI);

        editTextDNI = findViewById(R.id.editTextDNI);
        editTextLetra = findViewById(R.id.editTextLetra);

        tvValidar = findViewById(R.id.tvValidar);

        //Preparamos las funciones mas el evento onClick para cambiar el fondo
        btnValidarDNI.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            public void onClick(View v) {

                String dni = String.valueOf(editTextDNI.getText()) + String.valueOf(editTextLetra.getText());

                if (validar(dni)) {
                    editTextLetra.setBackgroundColor(R.color.verde);
                    editTextDNI.setBackgroundColor(R.color.verde);
                    tvValidar.setText(R.string.correcto);

                } else {
                    editTextLetra.setBackgroundColor(R.color.rojo);
                    editTextDNI.setBackgroundColor(R.color.rojo);
                    tvValidar.setText(R.string.incorrecto);
                }
            }
        });
    }

    private boolean validar(String dni) {
        String letraMayuscula = "";

        if(dni.length() != 9 || Character.isLetter(dni.charAt(8)) == false ) {
            return false;
        }

        letraMayuscula = (dni.substring(8)).toUpperCase();

        if (letraDNI(dni).equals(letraMayuscula)) {
            return true;
        }

        else {
            return false;
        }
    }

    private String letraDNI(String dni) {
        // El método es privado porque lo voy a usar internamente en esta clase, no se necesita fuera de ella

        // pasar miNumero a integer
        int miDNI = Integer.parseInt(dni.substring(0,8));
        int resto = 0;
        String miLetra = "";
        String[] asignacionLetra = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        resto = miDNI % 23;

        miLetra = asignacionLetra[resto];

        return miLetra;
    }

}