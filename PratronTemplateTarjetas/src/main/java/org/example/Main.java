package org.example;

public class Main {
    public static void main(String[] args) {

        TarjetaCredito credito = new TarjetaCredito("1122", "123", 1023, "Credito", 100000.00, 100000.00);

        TarjetaDebito debito = new TarjetaDebito("2211", "456", 1025, "Debito", 500000);

        System.out.println(credito.toString());
        System.out.println(debito.toString());

        System.out.println(credito.estaAutorizada(200000.0));
        System.out.println(debito.estaAutorizada(150.0));


    }
}


/*


credito
autorizada? => limite

debito
autorizada? => saldo



pagos


procesadorCredito : tarjeta y monto
validarFecha

procesadorDebito : tarjeta y monto
ValidarFecha


El pago se implemento?

 */