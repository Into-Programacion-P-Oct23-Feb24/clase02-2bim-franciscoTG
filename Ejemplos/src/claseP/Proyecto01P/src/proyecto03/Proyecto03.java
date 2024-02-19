/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto03;

import java.util.Scanner;
import proyecto02.Proyecto02;

public class Proyecto03 {

    public static void main(String[] arg){
        Scanner entrada = new Scanner(System.in);
        int edad = 17;
        String mensaje = Proyecto02.obtenerTipo(edad);
        System.out.printf("%s\n",mensaje);
    }
}    

