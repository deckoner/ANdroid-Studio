package com.example.listayintenciones;

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
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MisWebs extends AppCompatActivity {

    private ListView lwPaginas;
    private ArrayList<Pagina> listaPaginas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mis_webs);

        lwPaginas = findViewById(R.id.lwPaginas);

        //Creamos la lista y la cargamos con varios objetos tipo Pagina
        listaPaginas = new ArrayList<Pagina>();
        listaPaginas.add(new Pagina("Nivel20", "https://nivel20.com/", "nivel20"));
        listaPaginas.add(new Pagina("Twitter", "https://twitter.com/", "twitter"));
        listaPaginas.add(new Pagina("Twitch", "https://www.twitch.tv/", "twitch"));


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

            ImageView ivIcono = (ImageView)item.findViewById(R.id.ivIcono);
            ivIcono.setImageResource(getResources().getIdentifier(listaPaginas.get(position).getIcono(),"drawable",getPackageName()));

            TextView tvTitulo = (TextView)item.findViewById(R.id.tvNombre);
            tvTitulo.setText(listaPaginas.get(position).getNombre());

            TextView tvSubtitulo = (TextView)item.findViewById(R.id.tvURL);
            tvSubtitulo.setText(listaPaginas.get(position).getUrl());
            return (item);
        }
    }
}