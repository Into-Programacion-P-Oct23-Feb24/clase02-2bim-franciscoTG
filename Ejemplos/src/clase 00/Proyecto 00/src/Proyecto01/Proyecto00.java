package Proyecto01;

import java.util.Scanner;

public class Proyecto00 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nota = new String[4];
        String nombre; // Almacena los nombres
        String apellido; /// Almacena los apellidos
        for (int i = 0; i < nota.length; i = i + 1) { // Recorre nuestro arreglo unidimensional
            System.out.println("Ingrese su nombre");
            nombre = entrada.nextLine();
            System.out.println("Ingrese su apellido");
            apellido = entrada.nextLine(); // Recogemos informacion de tipo cadena por medio del objeto entrada
            String n=nombre.toLowerCase();
            if (n.equals("maria")) { // 
                nota[i] = "Correcto";
            }else{
            nota[i] = nombre + "" + apellido;
            }
        }
        for (int i = 0; i < nota.length; i = i + 1) {
            System.out.println(nota[i]);
        }
    }
}
