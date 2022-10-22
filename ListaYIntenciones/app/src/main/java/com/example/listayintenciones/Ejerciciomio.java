package com.example.listayintenciones;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class Ejerciciomio extends AppCompatActivity {

    private Spinner sArtistas;
    private ListView lwArtistas;
    private WebView wvCancion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejerciciomio);

        sArtistas = findViewById(R.id.sArtistas);
        wvCancion = findViewById(R.id.wvCancion);

        sArtistas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                switch (sArtistas.getSelectedItem().toString()) {

                    case ("cavetown"):
                        wvCancion.loadUrl("https://www.youtube.com/watch?v=uREGk0fT0GQ");
                        break;

                    case ("rosalia"):
                        wvCancion.loadUrl("https://www.youtube.com/watch?v=cgnEinOn2pw");
                        break;

                    case ("extremoduro"):
                        wvCancion.loadUrl("https://www.youtube.com/watch?v=pM3JPhWApvY");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}