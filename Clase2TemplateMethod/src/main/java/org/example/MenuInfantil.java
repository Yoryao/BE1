package org.example;

public class MenuInfantil extends MenuGenerico{

    private int juguetes;
    private double valorMenu;

    public MenuInfantil(double costo, int juguetes) {
        super.setCosto(costo);
        this.juguetes = juguetes;
        System.out.println("Se ordeno un menu Infantil.");
    }


    @Override
    public String CalcularCosto() {
        this.setValorMenu(this.getCosto() + this.getJuguetes() * 150);
        return "El precio del menu es, $ " + getValorMenu();
        }

    @Override
    public String ArmarPedido() {
        System.out.println("Calcular costo y valor de " + getJuguetes() + " juguetes.");
        return this.CalcularCosto();
    };

    public int getJuguetes() {
        return juguetes;
    }

    public void setJuguetes(int juguetes) {
        this.juguetes = juguetes;
    }

    public double getValorMenu() {
        return valorMenu;
    }

    public void setValorMenu(double valorMenu) {
        this.valorMenu = valorMenu;
    }
}
