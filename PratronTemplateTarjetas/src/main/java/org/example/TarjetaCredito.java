package org.example;

public class TarjetaCredito extends Tarjeta {

    private Double limite;
    private Double disponible;

    public TarjetaCredito(String numero, String codigo, int fecha, String tipoTarjeta, Double limite, Double disponible) {
        super(numero, codigo, fecha, tipoTarjeta);
        this.limite = limite;
        this.disponible = disponible;
    }

    @Override
    public boolean estaAutorizada(Double montoCompra){
        return montoCompra < disponible;
    }

    @Override
    public String toString() {
        return super.toString() +
                "limite=" + limite +
                ", disponible=" + disponible +
                "} ";
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Double getDisponible() {
        return disponible;
    }

    public void setDisponible(Double disponible) {
        this.disponible = disponible;
    }


}
