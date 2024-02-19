/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto01p;

import proyecto02.Proyecto02;

public class Proyecto01P {

    public class proyecto01 {

        public static void main(String[] arg) {

            int[] edades = {10, 9, 20, 17, 18, 19, 15};
            String caddenaFinal = "";

            for (int i = 0; i < edades.length; i++) {
                int edad = edades[i];
                String mensaje = Proyecto02.obtenerTipo(edad);
                System.out.printf("Edad :%d. %s\n", edad, mensaje);
            }
        }
    }
}
