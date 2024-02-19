/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto02;

public class Proyecto02 {

    public static String obtenerTipo(int miEdad) {
        String cadena = "Devolver valor ";
        if (miEdad >= 18) {
            System.out.println("la edad ingresada pertenece a mayor de edad ");

        } else {
            if (miEdad >= 12 && miEdad < 18) {
                System.out.println("La edad ingresada pertenece a un adolecente");

            } else {
                System.out.println("La edad ingresada es de un nino ");
            }
        }
        return cadena;
    }
}
