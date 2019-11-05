package ExamenDos;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (!salir) {
            System.out.println("Acceso a los siguientes ejercicios");

            System.out.println(" Ejercicio_1 //OPCION 1// ");
            System.out.println(" Ejercicio_2 //OPCION 2// ");
            System.out.println(" Ejercicio_3 //OPCION 3// ");
            System.out.println(" Ejercicio_4 //OPCION 4// ");
            System.out.println(" SALIR // OPCION 5 //");

            opcion = leer.nextByte();
            switch (opcion) {
                case 1:
                    Ejercicio1.main(args);
                    break;
                case 2:
                    Ejercicio2.main(args);
                    break;
                case 3:
                    Ejercicio3.main(args);
                    break;
                case 4:
                    Ejercicio4.main(args);
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Escoja un número: ");
            }
        }

    }
}
