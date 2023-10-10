package org.example;

public class MenuClasico extends MenuGenerico{


    public MenuClasico(double costo) {
        super();
        super.setCosto(costo);
        System.out.println("Se ordeno un menu clasico.");
    };

    @Override
    public String CalcularCosto() {
        return "El precio del menu es, $ " + this.getCosto();
    };

    @Override
    public String ArmarPedido() {
        System.out.println("Calcular los elementos del Pedido.");
        return this.CalcularCosto();
    };

}
