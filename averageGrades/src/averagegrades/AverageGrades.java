/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package averagegrades;

import java.util.*;

/**
 *
 * @author CHALA RAMIREZ
 */
public class AverageGrades {

    /**
     * Promedio de notas
     * Un estudiante tiene tres calificaciones.
     * El programa debe calcular y mostrar el promedio final.
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa la primera nota: ");
        double grade1 = sc.nextDouble();
        
        System.out.print("Ingresa la segunda nota: ");
        double grade2 = sc.nextDouble();
        
        System.out.print("Ingresa la tercera nota: ");
        double grade3 = sc.nextDouble();
        
        double average = (grade1 + grade2 + grade3) / 3;
        
        System.out.println("El promedio del estudiantes es: " + average);
        
        sc.close();
    }
    
}
