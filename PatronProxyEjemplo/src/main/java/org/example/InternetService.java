package org.example;

public class InternetService implements IConexionInternet{


    @Override
    public void ConectarCon(String url){
        System.out.println("Conectando con: " + url);
    }
}
