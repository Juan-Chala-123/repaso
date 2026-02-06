/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudiante;

import java.util.*;
import java.util.jar.Attributes;

/**
 *
 * @author CHALA RAMIREZ
 */
public class Estudiante {
    private String name, course;
    private double grade1, grade2, grade3;
    
    public Estudiante(String name, String course, double grade1, double grade2, double grade3) {
        this.name = name;
        this.course = course;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa el nombre del Estudiante: ");
        String name = sc.nextLine();
        
        System.out.print("Ingresa el curso: ");
        String course = sc.nextLine();
        
        System.out.print("Ingresa la primera nota: ");
        double grade1 = sc.nextDouble();
        
        System.out.print("Ingresa la segunda nota: ");
        double grade2 = sc.nextDouble();
        
        System.out.print("Ingresa la tercer nota: ");
        double grade3 = sc.nextDouble();
        
        double average = (grade1 + grade2 + grade3) / 3;
        
        Estudiante es = new Estudiante(name, course, grade1, grade2, grade3);
        
        System.out.println("\nEstudiante");
        System.out.println("Nombre: " + es.name);
        System.out.println("Curso: " + es.course);
        System.out.println("Promedio: " + average);
        
        if (average >= 3.0 && average <= 5.0) {
            System.out.println("El estudiante aprueba.");
        } else {
            System.out.println("El estudiante reprueba.");
        }
    }
}
