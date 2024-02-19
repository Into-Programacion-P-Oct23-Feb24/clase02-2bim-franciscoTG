
package Proyecto01;
import java.util.Scanner;

public class fabiangay {
    public static void main(String arg[]){
    Scanner entrada=new Scanner (System.in);
    String num[]=new String[5];
    double num1;
        for (int i = 0; i < num.length; i=i+1) {
            System.out.println("Ingrese sus notas");
            num1=entrada.nextDouble();
            if(num1>=7){
                num[i]="Correcto";
            }else{
                if(num1<7){
                    num[i]="Minga";
                }
            }
        }
        for (int i = 0; i <num.length; i++) {
            System.out.println(num[i]);
            
        }
    }  
}
