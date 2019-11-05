package ExamenDos;

import pe.edu.upeu.subprogramas.LeerTeclado;

public class Ejercicio1 {

    public static void main(String[] args) {
        int NAuto, ValAuto = 0, clave = 0, suma = 0, impuesto = 0;
        LeerTeclado lt = new LeerTeclado();
        //System.out.println("Ingrese un numero de automobiles: ");
        NAuto = lt.leer(0, "Ingrese el número de automobiles que tiene:");
        //System.out.println("ingrese valor de su automovil: ");
        ValAuto = lt.leer(0, "ingrese valor de sus automoviles: ");

        for (int i = 0; i < NAuto; i++) {
            clave = lt.leer(0, "Ingrese la clave de su automovil:");

            if (clave == 1) {
                impuesto = (int) (ValAuto * 0.1);
                System.out.println("El monto de impuesto a pagar es de: " + impuesto);
                suma = suma + impuesto;
            } else if (clave == 2) {
                impuesto = (int) (ValAuto * 0.07);
                System.out.println("El monto de impuesto a pagar es de:" + impuesto);
                suma = suma + impuesto;
            } else if (clave == 3) {
                impuesto = (int) (ValAuto * 0.05);
                System.out.println("El monto de impuesto a pagar es de: " + impuesto);
                suma = suma + impuesto;
            }

        }

    }
}
