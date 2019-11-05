package ExamenDos;

import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String[] args) {
        int [] vector={1,10,9,8,11,7,6,12,2,3,4,5};
        int i=0; boolean marca =false;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese mes Deseado: ");System.out.println("1=ENERO");System.out.println("2=FEBRERO");System.out.println("3=MARZO");
        System.out.println("4=ABRIL");System.out.println("5=MAYO");System.out.println("6=JUNIO");System.out.println("7=JULIO");System.out.println("8=AGOSTO");
        System.out.println("9=SEPTIEMBRE");System.out.println("10=OCTUBRE");System.out.println("11=NOVIEMBRE");System.out.println("12=DICIEMBRE");
        System.out.println("================");
        System.out.println("Indique un numero:");

        int mes = leer.nextByte();
        
        while (i<vector.length && marca==false) {    
            if (vector[i]==mes){
            marca = true;
            }
            i++;
        }
        if (marca==false) {
            System.out.println("Mes no ENCONTRADO");
        }else{
            System.out.println("El mes está hubicado en la posicion número - "+(i)+" - del vector");
        }
    }
}
