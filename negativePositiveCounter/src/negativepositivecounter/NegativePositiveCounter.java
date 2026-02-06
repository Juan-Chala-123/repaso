/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package negativepositivecounter;

import java.util.*;

public class NegativePositiveCounter {

    /**
     * Contador de positivos y negativos
     * El programa debe pedir números hasta que el usuario 
     * ingrese 0.
     * Al final, debe mostrar cuántos números fueron positivos y 
     * cuántos fueron negativos.
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa cuantos numeros desees.");
        System.out.println("El programa termina hasta que ingreses 0.");
        
        byte positive = 0;
        byte negative = 0;
        byte nums;
        
        do {
            System.out.print("Ingresa el numero: ");
            nums = sc.nextByte();
            
            if (nums > 0) {
                positive++;
            }
            if (nums < 0) {
                negative++;
            }
            
        } while (nums != 0);
        
        System.out.println("\nNumeros positivos: " + positive);
        System.out.println("Numeros negativos: " + negative);
        
        sc.close();
    }
    
}
