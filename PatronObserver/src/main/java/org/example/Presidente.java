package org.example;

public class Presidente extends Empleado{
    public Presidente() {
    }

    @Override
    public void ProcesarMensaje(Documento doc) {
        if(doc.getTipo() == 3){
            System.out.println("Mensaje al Presidente: " + doc.getContenido());
        } else {
            System.out.println("Tipo de mensaje Invalido");
        }
    }

}
