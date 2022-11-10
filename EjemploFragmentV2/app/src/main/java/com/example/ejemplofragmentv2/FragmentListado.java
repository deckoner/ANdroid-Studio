package com.example.ejemplofragmentv2;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentListado extends Fragment {
    private Libro[] datos = new Libro[] {
            new Libro("La casa en el mar mas azul", "TJ Klune",
                    "Muy posiblemente sea uno de los libros que haya leido que mejor " +
                            "lleguen al corazon, no por su romance (cosa que es muy muy secundaria " +
                            "y hasta casi el final del libro no aparece), si no que Klune ha " +
                            "construido una serie de niños creibles para el lector y como diria " +
                            "el propio autor unos muy especiales.", R.drawable.marmasazul),

            new Libro("El imperio final", "Brandon Sanderson",
                    "En resumen este señor es dios y deberias leerte todos sus libros " +
                            "punto y fin", R.drawable.impreiofinal),

            new Libro("Oliver Twist", "Charles Dickens",
                    "Cuenta las desventuras de un niño huerfano, desdichado, donde " +
                            "obviamente los malos son la gente pobre y los buenos son la clase " +
                            "alta de londres por que si algo era Charles Dickens era clasista, " +
                            "un clasista de mucho cuidad.", R.drawable.oliver),

            new Libro("El arte de la guerra", "Sun Tzu",
                    "Un libro con enseñanzas muy buenas para la vida cotidia, sobretodo " +
                            "si tienes vecionos molestos o en algun momento decides comvertirte en " +
                            "un señor de la guerra o simplemente aplastar a tus enemigos en una " +
                            "partidita de Age of Empire claramente amistosa", R.drawable.arte)
    };

    private ListView lstListado;
    private LibroListener listener;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_listado, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        lstListado = (ListView)getView().findViewById(R.id.lstListado);
        lstListado.setAdapter(new AdaptadorLibros(this));

        //Asignamos el evento onItemClick() a la lista de los libros
        lstListado.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View view, int position, long id) {
                if (listener != null)
                    listener.onCorreoSeleccionado(
                            (Libro)lstListado.getAdapter().getItem(position));
            }
        });
    }
    class AdaptadorLibros extends ArrayAdapter<Libro> {
        Activity context;
        AdaptadorLibros(Fragment context) {
            super(context.getActivity(), R.layout.listitem_correo, datos);
            this.context = context.getActivity();
        }

        @NonNull
        @Override
        public View getView(int position,
                            @Nullable View convertView,
                            @NonNull ViewGroup parent) {
            LayoutInflater inflater = context.getLayoutInflater();
            View item = inflater.inflate(R.layout.listitem_correo, null);
            TextView lblDe = (TextView) item.findViewById(R.id.lblDe);
            lblDe.setText(datos[position].getLibroTitulo());
            TextView lblAsunto = (TextView)item.findViewById(R.id.lblAsunto);
            lblAsunto.setText(datos[position].getAsunto());
            return (item);
        }
    }

    public void setLibroListener(LibroListener listener){
        this.listener = listener;
    }
}
