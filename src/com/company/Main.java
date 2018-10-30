package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenido, por favor introduzca el radio para cálcular la longitud (Expresé los decimales con una coma, por favor).");
        double a=scanner();
        double x=calculo(a);
        System.out.println("El valor de la longitud es: " +x);
    }

    /*
    Función main donde se declara el valor del radio y se imprime por pantalla
     */

    private static double scanner() {
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextDouble()) { //bucle para comprobar si lo introducido por el usuario son números
            System.out.println("Valor incorrecto, por favor introduzca un número");
            scan = new Scanner(System.in);
        }
        return scan.nextDouble();
    }

    /*
    Bucle while en el que se comprueba que el valor dado sea un número double
     */

    private static double calculo(double a){
        double x= 2*Math.PI*a;
        return x;
    }
    /*
    Simplemente la ecuación para resolver la longitud
     */
}