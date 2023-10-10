package org.example;

import java.util.Date;

public  abstract class Tarjeta {

    private String numero;
    private String codigo;
    private int fecha;
    private String tipoTarjeta;

    public Tarjeta(String numero, String codigo, int fecha, String tipoTarjeta) {
        this.numero = numero;
        this.codigo = codigo;
        this.fecha = fecha;
        this.tipoTarjeta = tipoTarjeta;
    }

    @Override
    public String toString() {
        return "Tarjeta{" +
                "numero='" + numero + '\'' +
                ", codigo='" + codigo + '\'' +
                ", fecha=" + fecha +
                ", tipoTarjeta='" + tipoTarjeta + '\'' +
                '}';
    }

    public abstract boolean estaAutorizada(Double montoCompra);

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String isTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }
}
