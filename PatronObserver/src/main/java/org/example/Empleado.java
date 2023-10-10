package org.example;

public abstract class Empleado {

    private Empleado siguienteEmpleado;

    public Empleado() {
    }

    public abstract void ProcesarMensaje(Documento doc);

    public Empleado getSiguienteEmpleado() {
        return siguienteEmpleado;
    }

    public void setSiguienteEmpleado(Empleado siguienteEmpleado) {
        this.siguienteEmpleado = siguienteEmpleado;
    }
}
