/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto04;
import java.util.Scanner;
import proyecto02.Proyecto02;
/**
 *
 * @author ft110
 */
public class Proyecto04 {
 public static void main (String [] arg){
        int [] edades = {10,9,20,17,18,19,15};
        String cadenaFinal = "";
        
        for (int i = 0; i < edades.length; i++) {
            int edad = edades[i];
            String mensaje = Proyecto02.obtenerTipo(edad);
            cadenaFinal = String.format("Edad :%s %d\n",cadenaFinal,edad,mensaje);
            
        }
        System.out.printf("%s\n",cadenaFinal);
 }
}
