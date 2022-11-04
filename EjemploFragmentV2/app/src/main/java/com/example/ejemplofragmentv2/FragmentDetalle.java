package com.example.ejemplofragmentv2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentDetalle extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_detalle, container,false);
    }
    public void mostrarDetalle (String texto) {
        TextView txtDetalle =
                (TextView)getView().findViewById(R.id.txtDetalle);
        txtDetalle.setText(texto);
    }
}
