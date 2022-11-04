package com.example.ejemplofragmentv2;

import android.app.Activity;
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
    private Correo[] datos = new Correo [] {
            new Correo ("Persona 1", "Asunto del correo 1", "Texto del Correo 1"),
            new Correo ("Persona 2", "Asunto del correo 2", "Texto del Correo 2"),
            new Correo ("Persona 3", "Asunto del correo 3", "Texto del Correo 3"),
            new Correo ("Persona 4", "Asunto del correo 4", "Texto del Correo 4"),
            new Correo ("Persona 5", "Asunto del correo 5", "Texto del Correo 5"),
            new Correo ("Persona 6", "Asunto del correo 6", "Texto del Correo 6"),
            new Correo ("Persona 7", "Asunto del correo 7", "Texto del Correo 7")};
    private ListView lstListado;
    private CorreoListener listener;

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
        lstListado.setAdapter(new AdaptadorCorreos(this));
//Asignamos el evento onItemClick() a la lista de los correos
        lstListado.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View view, int position, long id) {
                if (listener != null)
                    listener.onCorreoSeleccionado(
                            (Correo)lstListado.getAdapter().getItem(position));
            }
        });
    }
    class AdaptadorCorreos extends ArrayAdapter<Correo> {
        Activity context;
        AdaptadorCorreos(Fragment context) {
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
            lblDe.setText(datos[position].getDe());
            TextView lblAsunto = (TextView)item.findViewById(R.id.lblAsunto);
            lblAsunto.setText(datos[position].getAsunto());
            return (item);
        }
    }

    // public interface CorreoListener {
    // void onCorreoSeleccionado(Correo c);
    // }
    public void setCorreoListener (CorreoListener listener){
        this.listener = listener;
    }
}
