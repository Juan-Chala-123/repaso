/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package greaterthreenumbers;

import java.util.*;

/**
 *
 * @author CHALA RAMIREZ
 */
public class GreaterThreeNumbers {

    /**
     * Mayor de tres números
     * Diseñar un algoritmo que lea tres números 
     * distintos y muestre cuál es el mayor.
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa el primer numero: ");
        byte num1 = sc.nextByte();
        
        System.out.print("Ingresa el segundo numero: ");
        byte num2 = sc.nextByte();
        
        System.out.print("Ingresa el tercer numero: ");
        byte num3 = sc.nextByte();
        
        if (num1 > num2 && num1 > num3) {
            System.out.println("El numero " + num1 + " es mayor.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El numero " + num2 + " es mayor.");
        } else if (num3 > num2 && num3 > num1) {
            System.out.println("El numero " + num3 + " es mayor.");
        } else {
            System.out.println("Son iguales los numeros");
        }
        
        sc.close();
    }
    
}
