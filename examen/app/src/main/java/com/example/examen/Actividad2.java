package com.example.examen;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Actividad2 extends AppCompatActivity {

    ListView lwPaginas;
    private ArrayList<Pagina> listaPaginas;
    Button btnSalirActividad2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        lwPaginas = findViewById(R.id.lwPaginas);
        btnSalirActividad2 = findViewById(R.id.btnSalirActividad2);

        //Creamos la lista y la cargamos con varios objetos tipo Pagina
        listaPaginas = new ArrayList<Pagina>();
        listaPaginas.add(new Pagina("Añana", "http://www.cuadrilladeanana.es/anana/", "anana", "21,92 km2"));
        listaPaginas.add(new Pagina("Mundaka", "http://www.mundaka.org", "mundaka", "4,01 km2"));
        listaPaginas.add(new Pagina("Gernika-Lumo", "http://www.gernika-lumo.net/", "gernika", "8,60 km2"));
        listaPaginas.add(new Pagina("Laguardia", "http://www.laguardia-alava.net/", "laguardia", "81.08 km2"));
        listaPaginas.add(new Pagina("Vitoria-Gasteiz", "www.vitoria-gasteiz.org/", "vitoria_gasteiz", "276,08 km2"));


        //Adaptador personalizado
        AdaptadorMisPaginas adaptadorTitulares = (new AdaptadorMisPaginas(this, listaPaginas));
        lwPaginas.setAdapter(adaptadorTitulares);

        lwPaginas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posicion, long id) {
                Uri uri = Uri.parse(listaPaginas.get(posicion).getUrl());

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btnSalirActividad2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Actividad2.this, MainActivity.class);
                startActivity(intent);            }
        });
    }

    class AdaptadorMisPaginas extends ArrayAdapter<Pagina> {
        public AdaptadorMisPaginas(@NonNull Context context, ArrayList<Pagina> listaPaginas) {
            super(context, R.layout.listitem_paginas, listaPaginas);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            View item = inflater.inflate(R.layout.listitem_paginas, null);

            ImageView ivIcono = (ImageView) item.findViewById(R.id.ivIcono);
            ivIcono.setImageResource(getResources().getIdentifier(listaPaginas.get(position).getIcono(), "drawable", getPackageName()));

            TextView tvTitulo = (TextView) item.findViewById(R.id.tvNombre);
            tvTitulo.setText(listaPaginas.get(position).getNombre());

            TextView tvSuperficie = (TextView) item.findViewById(R.id.tvSuperficie);
            tvSuperficie.setText(listaPaginas.get(position).getSuperficie());

            TextView tvSubtitulo = (TextView) item.findViewById(R.id.tvURL);
            tvSubtitulo.setText(listaPaginas.get(position).getUrl());
            return (item);
        }
    }
}