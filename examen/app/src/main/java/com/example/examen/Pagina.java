package com.example.examen;

public class Pagina {
    private String nombre, url, icono, superficie;

    public Pagina(String nombre, String url, String icono, String superficie) {
        this.nombre = nombre;
        this.url = url;
        this.icono = icono;
        this.superficie = superficie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.icono = superficie;
    }
}
