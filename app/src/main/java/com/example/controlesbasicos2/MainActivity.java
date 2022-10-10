package com.example.controlesbasicos2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBox1;
    private TextView texto1, texto2;
    private RadioButton radioButton1, radioButton2, radioButton3, radioButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioButton1 = findViewById(R.id.radioButton1);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
        radioButton4 = findViewById(R.id.radioButton4);
        checkBox1 = findViewById(R.id.checkBox1);
        texto1 = findViewById(R.id.texto1);

        checkBox1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (checkBox1.isChecked()) {
                    texto1.setText("Esta marcado");
                } else {
                    texto1.setText("Esta sin marcar");
                }
            }
        });

//        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//                if (b){
//                    texto1.setText("PIM");
//                } else {
//                    texto1.setText("PUM");
//                }
//            }
//        });


    }
}