package org.example;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        MenuGenerico menu1 = new MenuClasico(1000.00);
        System.out.println(menu1.ArmarPedido());
        System.out.println("--------------------------------------");
        MenuGenerico menu2 = new MenuInfantil(1000.00, 4);
        System.out.println(menu2.ArmarPedido());
        System.out.println("--------------------------------------");
        MenuGenerico menu3 = new MenuVegetariano(1000.00, 3, 4);
        System.out.println(menu3.ArmarPedido());
        System.out.println("--------------------------------------");

    };
}