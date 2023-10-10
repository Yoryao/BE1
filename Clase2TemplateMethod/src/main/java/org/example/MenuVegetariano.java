package org.example;

public class MenuVegetariano extends MenuGenerico{
    private int especias;
    private int salsas;

    public MenuVegetariano(double costo, int especias, int salsas) {
        super.setCosto(costo);
        this.especias = especias;
        this.salsas = salsas;
        System.out.println("Se ordeno un menu Vegetariano.");
    }

    public String CalcularCosto(){
        this.setCosto(this.getCosto() + this.getEspecias() * 2);
        this.setCosto(this.getCosto() + this.getSalsas() * 2 );
        return "El valor del menu, con " + getSalsas() + " salsas y " + getEspecias() + " especias es de $" + getCosto() + ".";
    }

    @Override
    public String ArmarPedido() {
        System.out.println("Calcular costo y valor de " + getEspecias() + " especias y " + getSalsas() + " salsas." );
        return this.CalcularCosto();

    };


    public int getEspecias() {
        return especias;
    }

    public void setEspecias(int especias) {
        this.especias = especias;
    }

    public int getSalsas() {
        return salsas;
    }

    public void setSalsas(int salsas) {
        this.salsas = salsas;
    }
}
