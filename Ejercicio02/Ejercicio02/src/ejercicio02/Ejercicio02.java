/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int contador = 1;
        while (contador <= 15){
            
            if (contador%2!=1){
                System.out.printf("%d\n", contador);
                     contador = contador + 1;
            }
            contador = contador + 1;
                     
        }
            
        
    }
    
}
