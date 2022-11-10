package com.example.ejemplofragmentv2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements LibroListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentListado fragmentListado =
                (FragmentListado)getSupportFragmentManager().
                        findFragmentById(R.id.frgListado);
        fragmentListado.setLibroListener(this);
    }
    @Override
    public void onCorreoSeleccionado(Libro l) {
        boolean hayDetalle =
                (getSupportFragmentManager().findFragmentById(R.id.frgDetalle)!= null);
        if (hayDetalle) {
            String portadaString = l.getPortada()+"";
            ((FragmentDetalle)getSupportFragmentManager().
                    findFragmentById(R.id.frgDetalle)).mostrarDetalle(l.getTexto(), portadaString);
        }
        else {
            Intent i = new Intent(this, DetalleActivity.class);
            i.putExtra(DetalleActivity.EXTRA_TEXTO, l.getTexto());
            i.putExtra("portada", l.getPortada()+"");
            startActivity(i);
        }
    }
}