/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo062 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar y generar arreglos en Java
        Scanner entrada = new Scanner(System.in);
        int dato;
        // arreglo de tipo entero
        int[] arreglo1 = new int[7];

        // Se asigna valores al arreglo, pidiendo valores por teclado
        // se usa un ciclo repetitivo
        for (int i = 0; i < arreglo1.length; i++) {

            System.out.println("Ingrese un valor para el arreglo");
            dato = entrada.nextInt();
            if (dato > 5 && dato < 9 || dato == 11 || dato == 13 || dato == 14) {
                // se asigna la variable dato a la posición del arreglo
                // de acuerdo al valor de i
                // igualamos los datos 11 13 14
                // daots entre 5 y 9 
                arreglo1[i] = dato;
            } else {
                arreglo1[i] = 5;// mencionar 5 si se coloca otro numero 
            }
        }
        // Se hace uso del ciclo repetitivo for para recorrer el arreglo
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.printf("Subíndice o Índice %d, con valor %d\n",
                    i, arreglo1[i]);

        }

    }

}

