/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package averagearrangement;

import java.util.*;

/**
 *
 * @author CHALA RAMIREZ
 */
public class AverageArrangement {

    /**
     * Promedio de un arreglo
     * Diseñar un algoritmo que almacene 10 números en un 
     * arreglo y calcule el promedio, el número mayor y el menor.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        double sum = 0;
        
        System.out.println("Ingrese 10 numeros:");

        for (int i = 0; i < array.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            array[i] = sc.nextInt();
            
            sum += array[i];
        }

        double average = sum / array.length;
        int major = array[0];
        int minor = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > major) {
                major = array[i];
            }
            if (array[i] < minor) {
                minor = array[i];
            }
        }

        System.out.println("El numero mayor es: " + major);
        System.out.println("El numero menor es: " + minor);
        System.out.println("El promedio es: " + average);
        
        sc.close();
    }
    
}
