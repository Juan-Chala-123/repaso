/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplicationtable;

import java.util.*;

public class MultiplicationTable {

    /**
     * Tabla de multiplicar
     * El usuario ingresa un número y el programa muestra su 
     * tabla de multiplicar del 1 al 10.
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa el numero: ");
        byte num = sc.nextByte();
        
        System.out.println("Tabla de multiplicacion: " + num);
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        
        sc.close();
    }
    
}
