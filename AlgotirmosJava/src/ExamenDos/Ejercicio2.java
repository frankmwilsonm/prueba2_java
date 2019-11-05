package ExamenDos;

import pe.edu.upeu.subprogramas.LeerTeclado;

public class Ejercicio2 {

    static void main(String[] args) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public char valorchar(char[] args) {
        char Vchar;
        LeerTeclado lt = new LeerTeclado();
        Vchar = (char) lt.leer(0, "Ingrese un caracter");
        return 0;
    }

    public int valorboolean(int[] args) {
        int Vbool1, Vbool2 = 0, suma;
        LeerTeclado lt = new LeerTeclado();
        Vbool1 = lt.leer(0, "Ingrese el valor: ");
        suma = Vbool1 + Vbool2;
        return suma;
    }

}
