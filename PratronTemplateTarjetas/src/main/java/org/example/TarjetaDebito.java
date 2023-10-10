package org.example;

public class TarjetaDebito extends Tarjeta{

    private double saldo;

    public TarjetaDebito(String numero, String codigo, int fecha, String tipoTarjeta, double saldo) {
        super(numero, codigo, fecha, tipoTarjeta);
        this.saldo = saldo;
    }



    @Override
    public boolean estaAutorizada(Double montoCompra){
        return montoCompra < saldo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "saldo=" + saldo +
                "} ";
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
