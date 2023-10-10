package org.example;

public abstract class MenuGenerico {
    private double costo;

    public void MenuGenerico(double costo){
        this.costo = costo;
    };

    public abstract String CalcularCosto();

    public abstract String ArmarPedido();

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
