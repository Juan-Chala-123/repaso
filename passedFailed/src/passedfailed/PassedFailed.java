/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package passedfailed;

import java.util.*;

/**
 *
 * @author CHALA RAMIREZ
 */
public class PassedFailed {

    /**
     * Aprobado o reprobado
     * Un estudiante aprueba si su nota es mayor o igual a 60.
     * El programa debe mostrar si el estudiante aprueba o 
     * reprueba según su calificación.
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa la nota: ");
        byte grade = sc.nextByte();
        
        if (grade >= 60) {
            System.out.println("El estudiante aprueba.");
        } else {
            System.out.println("El estudiante reprueba.");
        }
        
        sc.close();
    }
    
}
