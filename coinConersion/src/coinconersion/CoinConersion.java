/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coinconersion;

import java.util.*;
/**
 *
 * @author CHALA RAMIREZ
 */
public class CoinConersion {

    /**
     * Conversión de monedas
     * Crear un algoritmo que reciba una cantidad de dinero en dólares 
     * y la convierta a euros, sabiendo que 1 dólar equivale a 0.92 euros.
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa la cantidad de dolares: ");
        int dollar = sc.nextInt();
        
        double euro = 0.92;
        
        double convert = dollar * euro;
        
        System.out.println("El resultado de la conversion es: " + convert);
        
        sc.close();
    }
    
}
