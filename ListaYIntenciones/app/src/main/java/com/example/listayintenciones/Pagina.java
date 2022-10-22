package com.example.listayintenciones;

public class Pagina {
    private String nombre, url, icono;

    public Pagina(String nombre, String url, String icono) {
        this.nombre = nombre;
        this.url = url;
        this.icono = icono;
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
}
