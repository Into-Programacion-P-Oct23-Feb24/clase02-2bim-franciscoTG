/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto01;

import java.util.Scanner;

public class proyecto01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double notas[] = new double[5];
        String cualitativas[] = new String[5];
        double notas1;
        for (int i = 0; i < notas.length; i = i + 1) {
            System.out.println("Ingrese sus notas");
            notas1 = entrada.nextDouble();
            if (notas1 >= 7) {
               cualitativas[i]="Correcto";
            } else {
                if(notas1<7){
                    cualitativas[i]="Incorrecto";
                }
            }
        }
        for (int i = 0; i < notas.length; i = i + 1){
            System.out.println(cualitativas[i]);
        }
    }
}
