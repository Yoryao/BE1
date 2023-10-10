package org.example;

public class Main {
    public static void main(String[] args) {

        Empleado pres = new Presidente();
        Empleado dipu = new Diputado();
        Empleado mini = new Ministro();

        mini.setSiguienteEmpleado(dipu);
        dipu.setSiguienteEmpleado(pres);

        Documento toPre = new Documento("Mensaje al Presi", 3);
        Documento toDip = new Documento("Mensaje al Dipu", 4);
        Documento toMin = new Documento("Mensaje al mini", 1);


        System.out.println("Mensaje al Presidente");
        mini.ProcesarMensaje(toPre);
        System.out.println("Mensaje al Dipu");
        mini.ProcesarMensaje(toDip);
        System.out.println("Mensaje al Ministro");
        mini.ProcesarMensaje(toMin);


    }
}