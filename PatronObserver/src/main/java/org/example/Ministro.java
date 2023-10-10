package org.example;

public class Ministro extends Empleado{
    public Ministro() {
    }

    @Override
    public void ProcesarMensaje(Documento doc) {
        if (doc.getTipo() == 1 ){
            System.out.println("To Ministros: " + doc.getContenido());
        } else if (getSiguienteEmpleado() != null) {
            getSiguienteEmpleado().ProcesarMensaje(doc);
        }
    }
}
