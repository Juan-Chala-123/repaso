/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package majorminornumber;

import java.util.*;

/**
 *
 * @author CHALA RAMIREZ
 */
public class MajorMinorNumber {

    /**
     * Número mayor y menor
     * El usuario ingresará varios números hasta ingresar -1.
     * El programa debe mostrar el número mayor y el número 
     * menor de todos los valores ingresados.
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Byte> numbers = new ArrayList<>();
        
        System.out.println("Ingresa cuantos numeros desees.");
        System.out.println("El programa termina hasta que ingreses un numero menor a cero.");
        
        
        byte nums;
        
        do {            
            System.out.print("Ingresa el numero: ");
            nums = sc.nextByte();
            
            if (nums > 0) {
                numbers.add(nums);
            }
            
        } while (nums > 0);
        
        byte major = numbers.get(0);
        byte minor = numbers.get(0);
        
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > major) {
                major = numbers.get(i);
            }
            if (numbers.get(i) < minor) {
                minor = numbers.get(i);
            }
        }
        
        sc.close();
        
        System.out.println("Numero mayor: " + major);
        System.out.println("Numero menor: " + minor);
    }
    
}
