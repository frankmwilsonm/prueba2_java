package ExamenDos;

import java.util.Scanner;
//import pe.edu.upeu.subprogramas.LeerTeclado;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vector = {42, 57, 14, 40, 96, 19, 8, 68, 1, 4};
        int temp;
        String orden, DES;
        DES = null;
        System.out.println("Ordenacion de Desendente a Ascendente");
        System.out.println("Ascwendente = ASC");
        System.out.println("Descendente = DES");
        System.out.println("========================");
        System.out.print("Ingrese valor: ");
        orden = leer.nextLine();
        if (orden.equals("DES")) {
            for (int i = 1; i < vector.length; i++) {
                for (int j = 0; j < vector.length - i; j++) {
                    if (vector[j] < vector[j + 1]) {
                        temp = vector[j];
                        vector[j] = vector[j + 1];
                        vector[j + 1] = temp;
                    }
                }
            }
            for (int i = 0; i < vector.length; i++) {
                System.out.println("  | " + vector[i] + "  |");
            }
        } else if (orden.equals("ASC")) {
            for (int i = 1; i < vector.length; i++) {
                for (int j = 0; j < vector.length - i; j++) {
                    if (vector[j] > vector[j + 1]) {
                        temp = vector[j];
                        vector[j] = vector[j + 1];
                        vector[j + 1] = temp;
                    }
                }

            }
            for (int i = 0; i < vector.length; i++) {
                System.out.println("  | " + vector[i] + "  |");
            }
        }
    }
}
