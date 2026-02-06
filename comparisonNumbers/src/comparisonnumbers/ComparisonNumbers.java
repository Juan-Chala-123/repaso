/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparisonnumbers;

import java.util.*;
/**
 *
 * @author CHALA RAMIREZ
 */
public class ComparisonNumbers {

    /**
     * Comparación de dos números
     * Diseñar un algoritmo que lea dos números enteros e indique 
     * si el primer número es mayor, si el segundo es mayor o si 
     * ambos son iguales.
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa el primer numero: ");
        byte num1 = sc.nextByte();
        
        System.out.print("Ingresa el segundo numero: ");
        byte num2 = sc.nextByte();
        
        if (num1 == num2) {
            System.out.println("Los numeros son iguales.");
        } else if (num1 > num2) {
            System.out.println("El primer numero (" + num1 + ") es mayor.");
        } else {
            System.out.println("El segundo numero (" + num2 + ") es mayor.");
        }
        
        sc.close();
    }
    
}
