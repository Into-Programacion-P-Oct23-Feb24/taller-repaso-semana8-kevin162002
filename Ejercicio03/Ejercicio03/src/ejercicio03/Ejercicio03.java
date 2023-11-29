/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author LAB.ELECT
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int valor1;
        int valor2;
        int resultado = 0;
        
        System.out.println("Ingrese el valor del multiplicando");
        valor1 = entrada.nextInt();
        System.out.println("Ingrese el valor del multiplicador");
        valor2 = entrada.nextInt();
        
        while (valor2 >= 1){
            if (valor2%2 == 1){
                resultado = resultado + valor1;
            }
            valor1 = valor1 * 2;
            valor2 = valor2 / 2;
            
        }
        System.out.printf("%d",resultado);
        
    }
    
}
