package com.example.listayintenciones;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class misWebs extends AppCompatActivity {

    private ListView lwPaginas;
    private ArrayList<Pagina> listaPaginas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mis_webs);

        lwPaginas = findViewById(R.id.lwPaginas);

        listaPaginas = new ArrayList<Pagina>();
        listaPaginas.add(new Pagina("cosa1", "cosa2"));
        listaPaginas.add(new Pagina("sdf", "sdf"));

        //ADAPTADOR Personalizado
        AdaptadorTitulares adaptadorTitulares = (new AdaptadorTitulares(this, listaPaginas));
        lwPaginas.setAdapter(adaptadorTitulares);

        lwPaginas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
    }

    class AdaptadorTitulares extends ArrayAdapter<Pagina> {

        public AdaptadorTitulares(@NonNull Context context, ArrayList<Pagina> listaPaginas) {
            super(context, R.layout.listitem_titular, listaPaginas);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            View item = inflater.inflate(R.layout.listitem_titular, null);
            TextView tvTitulo = (TextView)item.findViewById(R.id.tvTitulo);
            tvTitulo.setText(listaPaginas.get(position).getTitulo());
            TextView tvSubtitulo = (TextView)item.findViewById(R.id.tvSubTitulo);
            tvSubtitulo.setText(listaPaginas.get(position).getSubtitulo());
            return (item);
        }
    }
}