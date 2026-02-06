/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package searchvaluearray;

import java.util.*;
/**
 *
 * @author CHALA RAMIREZ
 */
public class SearchValueArray {

    /**
     * Búsqueda de un valor en un arreglo
     * Dado un arreglo de números generado automaticamente, 
     * el usuario ingresa un valor y el programa debe 
     * indicar si dicho valor existe o no dentro del arreglo.
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        
        System.out.print("Ingresa el numero: ");
        byte num = sc.nextByte();
        
        for (int i = 0; i < 10; i++) {
            array[i] = (int) ((Math.random() * 99) + 1);
            System.out.println(array[i]);
        }
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                System.out.println("El numero se encuentra.");
            }
        }
        
        sc.close();
    }
    
}
