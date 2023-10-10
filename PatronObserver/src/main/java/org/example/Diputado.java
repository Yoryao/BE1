package org.example;

public class Diputado extends Empleado{
    public Diputado() {
    }

    @Override
    public void ProcesarMensaje(Documento doc) {
        if (doc.getTipo() == 2 ){
            System.out.println("To Diputado: " + doc.getContenido());
        } else if (getSiguienteEmpleado() != null) {
            getSiguienteEmpleado().ProcesarMensaje(doc);
        }
    }
}
