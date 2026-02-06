/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumnumbers;

import java.util.*;

public class SumNumbers {

    /**
     * Suma de números
     * Diseñar un algoritmo que sume los primeros N 
     * números naturales, donde N es ingresado por el usuario.
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa un nunmero: ");
        byte num = sc.nextByte();
        byte sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        
        System.out.println("Suma: " + sum);
        
        sc.close();
    }
    
}
