package org.example;

public class Documento {
    private String contenido;
    private int tipo;
//      1 = Reservado
//      2 = Secreto
//      3 = Muy secreto

    public Documento(String contenido, int tipo) {
        this.contenido = contenido;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "contenido='" + contenido + '\'' +
                ", tipo=" + tipo +
                '}';
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
