/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto02;

import Proyecto03.Cualitativas;
import java.util.Scanner;

/*genera una funcion y analize las notas de 4 estudiantes cada estudiante 
     * posee 4 notas a analizar si la nota es menor a 7 guardar en un arreglo 
     * malo 
     * si la nota es mayor 7 y menor a 9 guardar buena 
     * si la nota es mayo o igual a 9 y menor igual a 10 guardar excelente esto 
     * se debe realizar con cada nota de los estudiantes 
     * alumno 1 maria 
     * alumno dos jose 
     * alumno tres luis 
     *    carla 
     * mensaje el nombre estu.nota numero 1 es igual nota cualitativa cada uno
 */
public class Ejemplo01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[][] notas = {{8, 9, 5, 8},
        {7, 7, 1, 9},
        {2, 3, 10, 0},
        {10, 5, 8, 10}};
        String estudiantes[] = {"Maria", "Jose", "Luis", "Lucia"};
        String mensaje[] = new String[4];
        mensaje = obtenerValorcualitativo(notas, estudiantes);
        System.out.printf("%s\n%s\n%s\n%s\n", mensaje[0], mensaje[1], mensaje[2], mensaje[3]);
    }

    public static String[] obtenerValorcualitativo(double[][] notas,
            String estudiantes[]) {
        String mensajeFinal[] = new String[4];
        String cadenaFinal = "";
        String cadena;
        for (int f = 0; f < notas.length; f++) {
            if (notas[f][0] < 7) {
                cadenaFinal = String.format("%sMaria:%s\n", cadenaFinal, cadena = "Minga");
            } else {
                if (notas[f][0] >= 7 && notas[f][0] <= 9) {
                    cadenaFinal = String.format("%sMaria:%s\n", cadenaFinal, cadena = "Bueno");
                } else {
                    if (notas[f][0] > 9 && notas[f][0] <= 10) {
                        cadenaFinal = String.format("%sMaria:%s\n", cadenaFinal, cadena = "Excelente");
                    }
                }

            }
        }
        mensajeFinal[0] = cadenaFinal;
        cadenaFinal = "";
        for (int f = 0; f < notas.length; f++) {
            if (notas[f][1] < 7) {
                cadenaFinal = String.format("%sJose:%s\n", cadenaFinal, cadena = "Minga");
            } else {
                if (notas[f][1] >= 7 && notas[f][1] <= 9) {
                    cadenaFinal = String.format("%sJose:%s\n", cadenaFinal, cadena = "Bueno");
                } else {
                    if (notas[f][1] > 9 && notas[f][1] <= 10) {
                        cadenaFinal = String.format("%sJose:%s\n", cadenaFinal, cadena = "Excelente");
                    }
                }
            }
        }
        mensajeFinal[1] = cadenaFinal;
        cadenaFinal = "";
        for (int f = 0; f < notas.length; f++) {
            if (notas[f][2] < 7) {
                cadenaFinal = String.format("%sLuis:%s\n", cadenaFinal, cadena = "Minga");
            } else {
                if (notas[f][2] >= 7 && notas[f][2] <= 9) {
                    cadenaFinal = String.format("%sLuis:%s\n", cadenaFinal, cadena = "Bueno");
                } else {
                    if (notas[f][2] > 9 && notas[f][2] <= 10) {
                        cadenaFinal = String.format("%sLuis:%s\n", cadenaFinal, cadena = "Excelente");
                    }
                }
            }
        }
        mensajeFinal[2] = cadenaFinal;
        cadenaFinal = "";
        for (int f = 0; f < notas.length; f++) {
            if (notas[f][3] < 7) {
                cadenaFinal = String.format("%sLucia:%s\n", cadenaFinal, cadena = "Minga");
            } else {
                if (notas[f][3] >= 7 && notas[f][3] <= 9) {
                    cadenaFinal = String.format("%sLucia:%s\n", cadenaFinal, cadena = "Bueno");
                } else {
                    if (notas[f][3] > 9 && notas[f][3] <= 10) {
                        cadenaFinal = String.format("%sLucia:%s\n", cadenaFinal, cadena = "Excelente");
                    }
                }
            }
        }
        mensajeFinal[3] = cadenaFinal;
        cadenaFinal = "";
        return mensajeFinal;
    }
}
