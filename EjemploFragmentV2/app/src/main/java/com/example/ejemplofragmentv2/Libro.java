package com.example.ejemplofragmentv2;

import android.graphics.drawable.Drawable;

public class Libro {

    private String libroTitulo;
    private String asunto;
    private String texto;
    private int portada;

    public Libro(String libroTitulo, String autor, String texto, int portada) {
        this.libroTitulo = libroTitulo;
        this.asunto = autor;
        this.texto = texto;
        this.portada = portada;
    }

    public String getLibroTitulo() {
        return libroTitulo;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getTexto() {
        return texto;
    }

    public int getPortada() {
        return portada;
    }
}